# Product API (Spring Boot + MySQL + Docker)

This is a fully functional, production-ready **RESTful API** built with **Spring Boot**, connected to **MySQL**, and Dockerized for deployment. It allows full CRUD operations on a `Product` resource.

---

## Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Docker  
- Maven  

---

## Features

- Clean layered architecture: Controller → Service → Repository → Database  
- Connects to **local MySQL** or Dockerized MySQL  
- Docker support with environment-based DB config  
- CRUD REST endpoints  
- Ready to deploy via Docker Hub  

---

## API Endpoints

| Method | URL                  | Description        |
|--------|----------------------|--------------------|
| GET    | `/api/products`      | Get all products   |
| GET    | `/api/products/{id}` | Get product by ID  |
| POST   | `/api/products`      | Create a new product |
| DELETE | `/api/products/{id}` | Delete a product by ID |

---

## Run with Docker (Using Local MySQL)

### 1. Build the JAR
```bash
./mvnw clean package
```

### 2. Build Docker Image
```bash
docker build -t barambaras/product-api .
```

### 3. Run Docker Container
Make sure your local MySQL is running on port `3306`, then:
```bash
docker run -p 8080:8080 --name product-api \
--add-host=host.docker.internal:host-gateway \
-e SPRING_DATASOURCE_URL=jdbc:mysql://host.docker.internal:3306/product_db \
-e SPRING_DATASOURCE_USERNAME=** \
-e SPRING_DATASOURCE_PASSWORD=** \
barambaras/product-api
```

---

## Docker Hub Image

[barambaras/product-api on Docker Hub](https://hub.docker.com/r/barambaras/product-api)

---

## Example JSON Request

```json
{
  "name": "Notebook",
  "price": 7.99
}
```

---

## Author

**Missie Kahsay**  
Backend Developer | AWS Certified | DevOps  
GitHub: [github.com/missiekahsay](https://github.com/missiekahsay)

---
