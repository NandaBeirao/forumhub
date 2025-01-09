FórumHub

FórumHub é uma API RESTful desenvolvida em Java utilizando o framework Spring Boot. Seu objetivo é gerenciar tópicos de discussão em um fórum online, permitindo operações de criação, leitura, atualização e exclusão (CRUD) de tópicos.

Funcionalidades Principais:

Gerenciamento de Tópicos: Permite criar, visualizar, atualizar e deletar tópicos do fórum.
Autenticação e Autorização: Implementa segurança nas operações através de autenticação baseada em tokens JWT.
Persistência de Dados: Utiliza um banco de dados relacional para armazenar as informações dos tópicos.
Tecnologias Utilizadas:

Java 17: Linguagem de programação utilizada no desenvolvimento.
Spring Boot 3.0.0: Framework para simplificar a criação de aplicações Java.
Spring Data JPA: Facilita a integração e manipulação dos dados no banco de dados.
Spring Security: Responsável pela implementação de autenticação e autorização.
Flyway: Gerencia as migrações do banco de dados.
MySQL: Banco de dados relacional utilizado para persistência.
JSON Web Token (JWT): Utilizado para a autenticação segura dos usuários.
Endpoints Principais:

POST /topicos: Cria um novo tópico.
GET /topicos: Lista todos os tópicos.
GET /topicos/{id}: Exibe detalhes de um tópico específico.
PUT /topicos/{id}: Atualiza as informações de um tópico existente.
DELETE /topicos/{id}: Remove um tópico.
