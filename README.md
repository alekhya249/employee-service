# 🛠️ Employee Management REST API

This is a Spring Boot-based REST API that manages employee data. It supports adding new employees and retrieving the existing list. Unit tests were written using JUnit 5 and Mockito to ensure code reliability.

---

## 🚀 Features

- Java 17 & Spring Boot 3.5.3
- REST endpoints for GET and POST
- In-memory employee data
- Unit tests with **JUnit** and **Mockito**
- Clean MVC architecture

---

## 📦 Project Structure

src
├── main
│   └── java
│       └── com.example.employeeservice
│           ├── Employee.java
│           ├── Employees.java
│           ├── EmployeeManager.java
│           └── EmployeeController.java
├── test
│   └── java
│       └── com.example.employeeservice
│           └── EmployeeControllerTest.java



---

## 🧪 How to Run Tests

```bash
./mvnw test


## how to run the APP
./mvnw spring-boot:run

📬 Endpoints

Method	Endpoint	Description
GET	/employees	Get list of employees
POST	/employees	Add a new employee


💡 Tech Stack

Java 17
Spring Boot
Maven
JUnit 5
Mockito
Postman (for API testing)


