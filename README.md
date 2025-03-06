# **Spring Boot Web Services with JPA & Hibernate**

A RESTful web services project built with **Java**, **Spring Boot**, **JPA**, and **Hibernate**. The project includes **CRUD operations, database management with H2 and PostgreSQL, exception handling, and deployment configuration**.

## 📌 **Features**
✔ **Spring Boot Setup** – Project initialized with Spring Boot, Maven, and Java 21.  
✔ **Domain Modeling** – Entities, relationships, and JPA mappings.  
✔ **CRUD Operations** – Create, Retrieve, Update, and Delete operations.  
✔ **Database Integration** – Uses **H2 for testing** and **PostgreSQL for production**.  
✔ **Exception Handling** – Implements custom error handling for API robustness.  
✔ **Profile-Based Configuration** – Different settings for **test**, **dev**, and **prod** environments.  

---

## 🛠 **Technologies Used**
- **Java 21**
- **Spring Boot** (Spring Web, Spring Data JPA)
- **Hibernate** (ORM for database interactions)
- **H2 Database** (Test environment)
- **PostgreSQL** (Production database)
- **Maven** (Build and dependency management)

---

## 🚀 **Getting Started**

### **1️⃣ Clone the Repository**
```bash
git clone https://github.com/Xamacardoso/Jpa-Hibernate-Demo-Project.git springboot-webservices
cd springboot-webservices
```

### **2️⃣ Configure the Database**
Modify the `application.properties` based on the environment:

#### **For Testing (H2 Database)**
```properties
spring.profiles.active=test
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

#### **For Development (PostgreSQL)**
```properties
spring.profiles.active=dev
spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_course
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### **3️⃣ Run the Application**
```bash
mvn spring-boot:run
```
The API will be available at: `http://localhost:8080/`

---

## 📚 **API Endpoints**

### **User Management**
- **GET** `/users` – Get all users
- **POST** `/users` – Create a new user
- **GET** `/users/{id}` – Retrieve a user by ID
- **PUT** `/users/{id}` – Update user details
- **DELETE** `/users/{id}` – Remove a user

### **Order & Product Management**
- **GET** `/orders` – Retrieve orders
- **POST** `/orders` – Create an order
- **GET** `/products` – List all products

---

## 🧪 **Testing**
Run the tests using:
```bash
mvn test
```