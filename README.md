# 📦 Spring Boot Project with JPA, MongoDB, and HTTP Security
This is a backend application built with **Spring Boot**, integrating both **JPA** and **MongoDB (local)** for data persistence. It uses **Spring Security** for HTTP-level security configuration and standardizes API responses using `ResponseEntity`.

## 🚀 Technologies Used

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Spring Data MongoDB**
- **MongoDB (local)**
- **Spring Security**
- **ResponseEntity**
- **Gradle**
- **slf4j**

## 🧩 Features

- Full CRUD operations using both JPA and MongoDB
- Standardized HTTP responses with `ResponseEntity`
- Authentication and authorization configured via `HttpSecurity`
- Input validation and exception handling
- Separation of concerns with layered architecture (Controller, Service, Repository)

## 🛠️ Running Locally

1. Make sure MongoDB is running locally on the default port (`27017`).
2. Make sure JDK 17 is installed
3. Clone the repository:
   ```
   git clone https://github.com/stephaniepb/spring-demo.git
   cd spring-demo
   ```
4. Run the project via IDE (Intellij or VS Code)
5. ```
   username: admin
   password: 1234
   ```
6. payload sample:
   ```
   {
      "name": "Stephanie",
      "email": "stephanie@example.com"
   }
   ```
   
