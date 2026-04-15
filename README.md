# Paytool 💳

> **PT** | Web service RESTful construído com Spring Boot, JPA e Hibernate.  
> **EN** | RESTful web service built with Spring Boot, JPA and Hibernate.

![Java](https://img.shields.io/badge/Java-25-orange?style=flat-square&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-6DB33F?style=flat-square&logo=springboot)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apachemaven)
![H2](https://img.shields.io/badge/H2-Database-blue?style=flat-square)
![JPA](https://img.shields.io/badge/JPA%20%2F%20Hibernate-59666C?style=flat-square)

---

## 📋 Sobre / About

**PT:** Projeto de web services com modelo de domínio completo (Usuários, Pedidos, Produtos, Categorias e Pagamentos), estruturado em camadas lógicas (Resource, Service, Repository) com tratamento de exceções e banco de dados H2 em memória para testes.

**EN:** Web service project with a complete domain model (Users, Orders, Products, Categories and Payments), structured in logical layers (Resource, Service, Repository) with exception handling and H2 in-memory database for testing.

---

## 🗂️ Domain Model

```
User ──< Order >── OrderItem >── Product >── Category
               └── Payment
```

| Entity     | Key Fields                                      |
|------------|-------------------------------------------------|
| User       | id, name, email, phone, password                |
| Order      | id, moment, orderStatus, client (User)          |
| Product    | id, name, description, price, imgUrl            |
| Category   | id, name                                        |
| OrderItem  | quantity, price, subTotal()                     |
| Payment    | id, moment                                      |

**OrderStatus:** `WAITING_PAYMENT` · `PAID` · `SHIPPED` · `DELIVERED` · `CANCELED`

---

## 🚀 Como rodar localmente / How to run locally

### Pré-requisitos / Prerequisites

- Java 17+
- Maven 3.x

### PT: Passos

```bash
# 1. Clone o repositório
git clone https://github.com/<seu-usuario>/paytool.git
cd paytool

# 2. Execute o projeto
./mvnw spring-boot:run

# 3. Acesse o console H2 (banco de dados em memória)
# URL: http://localhost:8080/h2-console
# JDBC URL: jdbc:h2:mem:testdb
# User: sa | Password: (vazio)
```

### EN: Steps

```bash
# 1. Clone the repository
git clone https://github.com/<your-username>/paytool.git
cd paytool

# 2. Run the project
./mvnw spring-boot:run

# 3. Access the H2 console (in-memory database)
# URL: http://localhost:8080/h2-console
# JDBC URL: jdbc:h2:mem:testdb
# User: sa | Password: (empty)
```

---

## 📡 API Endpoints

Base URL: `http://localhost:8080`

### Users `/users`

| Method   | Endpoint      | Description (EN) / Descrição (PT)         |
|----------|---------------|-------------------------------------------|
| `GET`    | `/users`      | List all users / Listar todos os usuários |
| `GET`    | `/users/{id}` | Find user by ID / Buscar usuário por ID   |
| `POST`   | `/users`      | Create user / Criar usuário               |
| `PUT`    | `/users/{id}` | Update user / Atualizar usuário           |
| `DELETE` | `/users/{id}` | Delete user / Deletar usuário             |

**POST / PUT body:**
```json
{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}
```

### Orders `/orders`

| Method | Endpoint       | Description (EN) / Descrição (PT)       |
|--------|----------------|-----------------------------------------|
| `GET`  | `/orders`      | List all orders / Listar todos os pedidos |
| `GET`  | `/orders/{id}` | Find order by ID / Buscar pedido por ID  |

### Products `/products`

| Method | Endpoint         | Description (EN) / Descrição (PT)         |
|--------|------------------|-------------------------------------------|
| `GET`  | `/products`      | List all products / Listar todos os produtos |
| `GET`  | `/products/{id}` | Find product by ID / Buscar produto por ID  |

### Categories `/categories`

| Method | Endpoint           | Description (EN) / Descrição (PT)              |
|--------|--------------------|------------------------------------------------|
| `GET`  | `/categories`      | List all categories / Listar todas as categorias |
| `GET`  | `/categories/{id}` | Find category by ID / Buscar categoria por ID   |

---

## 🧪 Testing the API / Testando a API

**PT:** Recomendamos o uso do [Postman](https://www.postman.com/) para testar os endpoints. Com a aplicação rodando, basta criar requisições apontando para `http://localhost:8080`.

**EN:** We recommend using [Postman](https://www.postman.com/) to test the endpoints. With the application running, just create requests pointing to `http://localhost:8080`.

**Exemplo / Example — POST `/users`:**

```
POST http://localhost:8080/users
Content-Type: application/json

{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}
```

---

## 🛠️ Tech Stack

| Technology     | Purpose                            |
|----------------|------------------------------------|
| Spring Boot    | Application framework              |
| Spring Web     | REST API                           |
| Spring Data JPA| Data access layer                  |
| Hibernate      | ORM                                |
| H2 Database    | In-memory test database            |
| Maven          | Dependency management & build tool |

---

## 📄 License

PT: Este projeto está sob a licença MIT.  
EN: This project is licensed under the MIT License.
