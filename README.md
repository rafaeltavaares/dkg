# API de Captura de Resultados de Pesquisa

## Descrição

Esta API foi desenvolvida como parte de um projeto de iniciação científica da Universidade Federal do Rio de Janeiro. O objetivo principal da API é capturar os resultados de pesquisas feitas pelos usuários e realizar cálculos baseados na métrica "Degree of Knowledge Gain" proposta pelo Professor Marcelo Tibau. Essa métrica visa avaliar o ganho de conhecimento dos usuários ao longo de suas interações.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação utilizada para desenvolver a API.
- **Spring Boot**: Framework que facilita a criação de aplicações web em Java.
- **JPA (Java Persistence API)**: Para o gerenciamento de dados.
- **PostGrees database**: Banco de dados em memória para testes e desenvolvimento (ou outro banco de dados de sua escolha).

## Funcionalidades

- Captura de resultados de pesquisas realizadas pelos usuários.
- Cálculo do "Degree of Knowledge Gain" com base nos dados capturados.
- API RESTful para interação com o frontend ou outras aplicações.

## Endpoints

### 1. Captura de Resultados

- **POST api/search/dkg**
  - Descrição: Captura os resultados de uma pesquisa realizada por um usuário.
  - Request Body:
    ```json
    {
      "usuarioId": "string",
      "resultado": "string"
    }
    ```

## Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/rafaeltavaares/dkg.git
