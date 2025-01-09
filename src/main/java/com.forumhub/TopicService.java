package com.forumhub.service;

import com.forumhub.model.Topic;
import com.forumhub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public ResponseEntity<Topic> getTopicById(Long id) {
        Optional<Topic> topic = topicRepository.findById(id);
        return topic.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    public Topic createTopic(Topic topic) {
        topic.setCreatedAt(LocalDateTime.now());
        return topicRepository.save(topic);
    }

    public ResponseEntity<Topic> updateTopic(Long id, Topic topicDetails) {
        Optional<Topic> optionalTopic = topicRepository.findById(id);
        if (optionalTopic.isPresent()) {
            Topic topic = optionalTopic.get();
            topic.setTitle(topicDetails.getTitle());
            topic.setMessage(topicDetails.getMessage());
            topic.setStatus(topicDetails.getStatus());
            topic.setCourse(topicDetails.getCourse());
            return ResponseEntity.ok(topicRepository.save(topic));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    public ResponseEntity<Void> deleteTopic(Long id) {
        Optional<Topic> topic = topicRepository.findById(id);
        if (topic.isPresent()) {
            topicRepository.delete(topic.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
