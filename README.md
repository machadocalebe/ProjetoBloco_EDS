# BePilot API - Back-end (Projeto de Bloco TP5)

Este repositório contém a API RESTful construída para a **BePilot**, uma plataforma inovadora que conecta alunos de autoescola a instrutores parceiros. Desenvolvido como projeto de conclusão (Projeto de Bloco) para o Instituto Infnet.

## Deploy em Produção
A API está hospedada e rodando na nuvem através do Render.
**Link da API:** # BePilot API - Back-end (Projeto de Bloco TP5)

Este repositório contém a API RESTful construída para a **BePilot**, uma plataforma inovadora que conecta alunos de autoescola a instrutores parceiros. Desenvolvido como projeto de conclusão (Projeto de Bloco) para o Instituto Infnet.

## Deploy em Produção
A API está hospedada e rodando na nuvem através do Render.
**Link da API:** https://projetobloco-eds.onrender.com/api

## Arquitetura e Tecnologias
- **Linguagem:** Java 21
- **Framework:** Spring Boot 3
- **Persistência:** Spring Data JPA com banco de dados H2 (in-memory)
- **Containerização:** Docker (via Dockerfile multistage)
- **CI/CD:** GitHub Actions (Esteira automatizada de build e testes)
- **Qualidade:** Testes unitários com JUnit 5 e Mockito (100% de Cobertura de Código validada)

## Funcionalidades da API (Endpoints)
- `POST /api/instrutores`: Cadastra novos instrutores parceiros.
- `GET /api/instrutores`: Retorna a lista de instrutores disponíveis.
- `DELETE /api/instrutores/{cpf}`: Remove um instrutor.
- `POST /api/alunos`: Matricula um novo aluno vinculando-o a um instrutor (`@ManyToOne`).
- `GET /api/alunos`: Retorna os alunos e seus respectivos instrutores.
- `DELETE /api/alunos/{cpf}`: Remove um aluno.

## Como executar localmente
1. Clone o repositório.
2. Certifique-se de ter o JDK 21 e o Maven instalados.
3. Execute o comando de build: `mvn clean install`
4. Inicie a aplicação: `mvn spring-boot:run`
5. A API estará acessível em `http://localhost:8080`.

## Arquitetura e Tecnologias
- **Linguagem:** Java 21
- **Framework:** Spring Boot 3
- **Persistência:** Spring Data JPA com banco de dados H2 (in-memory)
- **Containerização:** Docker (via Dockerfile multistage)
- **CI/CD:** GitHub Actions (Esteira automatizada de build e testes)
- **Qualidade:** Testes unitários com JUnit 5 e Mockito (100% de Cobertura de Código validada)

## Funcionalidades da API (Endpoints)
- `POST /api/instrutores`: Cadastra novos instrutores parceiros.
- `GET /api/instrutores`: Retorna a lista de instrutores disponíveis.
- `DELETE /api/instrutores/{cpf}`: Remove um instrutor.
- `POST /api/alunos`: Matricula um novo aluno vinculando-o a um instrutor (`@ManyToOne`).
- `GET /api/alunos`: Retorna os alunos e seus respectivos instrutores.
- `DELETE /api/alunos/{cpf}`: Remove um aluno.

## Como executar localmente
1. Clone o repositório.
2. Certifique-se de ter o JDK 21 e o Maven instalados.
3. Execute o comando de build: `mvn clean install`
4. Inicie a aplicação: `mvn spring-boot:run`
5. A API estará acessível em `http://localhost:8080`.