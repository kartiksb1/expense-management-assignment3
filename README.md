# Expense Management API

A simple **Expense Management REST API** built using **Spring Boot 3.x** and **Java 17**.  
This application allows users to add expenses, list expenses within a date range, and delete expenses while enforcing validation and clean REST design principles.

---
## REST Design Decisions
- Used plural nouns (`/expenses`) as per REST conventions
- Used DTOs to avoid exposing entities directly
- Used query parameters for filtering instead of request body
- Controllers contain no business logic; services handle processing


## 📌 Features

- Add a new expense
- List expenses by date range
- Delete an expense by ID
- Input validation
- Global exception handling
- DTO-based API design
- Clean layered architecture

---

## 🛠 Tech Stack

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Hibernate**
- **MySQL**
- **Maven**

---
