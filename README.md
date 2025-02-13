# CRUD em Spring Boot 🍃

Esse projeto é uma aplicação CRUD simples usando **Spring Boot** e os conhecimentos adquidos no bootcamp Decola Tech 2025 na DIO.me . A aplicação permite realizar operações básicas em um
modelo de **Produto**.

## Funcionalidades 🚀

- **Criar:** Cria um novo produto.
- **Ler:** List todos os produtos ou busca um produto por ID.
- **Atualizar:** Atualiza um produto existente.
- **Excluir:** Exclui um produto pelo ID.

## Tecnologias utilizadas 💻

- **Spring Boot:** Framework para a criação da aplicação.
- **Spring Data JPA:** Para persistência dos dados no banco de dados.
- **H2 Database:** Banco de dados em memória (pode ser substituído por outros bancos como PostGreSQL, MySQL e outros).
- **Lombok:** Para reduzir a verbosidade do código (gera getters, setters, etc.).
- **Maven:** Gerenciador de dependências

## Pré-requisitos 📍

- **Java 17+**
- **Maven** instalado em sua máquina(para construir o projeto)
- **IDE** (como IntelliJ ou VS Code) para editar o código (opcional).

## Como rodar o projeto 🆙⚡

### 1. Clone o repositório

```bash
git clone git@github.com:JoseLSousa/CRUD-SpringBoot.git
cd CRUD-SpringBoot
```

### 2. Execute o projeto

Se você já tem o **Maven** instalado, pode rodar o projeto via terminal com o seguinte comando:

```bash
mvn spring-boot:run
```

Ou se você está usando uma IDE (como IntelliJ ou VS Code), basta importar o projeto como um projeto Maven e executar a
classe **SpringApiApplication**.

### 3. Acessando a API

A API estará disponível em http://localhost:8080 ou através do Swagger em http://localhost:8080/swagger-ui/index.html.
Aqui estão os endpoints:

- **POST** ``/products`` - Cria um novo produto.
- **GET** ``/products`` - Lista todos os produtos.
- **GET** ``/products/{id}`` - Busca um produto pelo ID.
- **PUT** ``/products/{id}`` - Atualiza um produto existente.
- **DELETE** ``/products/{id}`` - Exclui um produto pelo ID.

### 4. Banco de dados

Por padrão, a aplicação usa um banco de dados H2 em memória. Quanto o Spring for iniciado, o banco de dados será criado
automaticamente.

Você pode visualizar o banco de dados acessando http://localhost:8080/h2-console e configurando o campo **JDBC URL:**
para ``jdbc:h2:mem:testdb``.

## Estrutura do projeto 📂

````bash
spring-api/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── me.dio.spring_api/
│   │   │       ├── controllers/          # Controladores (REST API)
│   │   │       ├── models/               # Modelos de dados (Product.java)
│   │   │       ├── repositories/         # Repositórios JPA
│   │   │       └── SpringApiApplication.java  # Classe principal
│   │   ├── resources/
│   │   │   └── application.properties    # Configurações da aplicação
└── pom.xml                                 # Dependências Maven

````

## Diagrama de classe (Product.java) 📝

````mermaid
classDiagram
    class Product {
        +Integer id
        +String name
        +String description
        +Integer price
    }

````

## Contribuindo 🤝

Sinta-se à vontade para contribuir com melhorias ou correções. Basta fazer um fork do projeto, realizar suas alterações
e criar um ``pull request``.

## Licença 📜

Este projeto é de uso livre. Consulte a licença em **LICENSE** para mais detalhes.
