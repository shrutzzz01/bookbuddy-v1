# 📚 BookBuddy v1 – Java Spring Boot REST API

A simple personal book tracker that allows users to add, view, and manage books they’ve read or want to read.  
Originally written as a console-based Java application and later transformed into a **Spring Boot REST API**.

---

## 🚀 Features

- ✅ Add new books (title, author, genre)
- 📖 View all books, read books, or unread books
- 🔎 Search/filter books by genre or title
- 🟢 Mark books as read or unread
- 🌐 Exposed as RESTful API using Spring Boot

---

## 🛠️ Tech Stack

- **Java 20**
- **Spring Boot**
- **Spring Web**
- **Maven**
- **In-memory data (List)** – No database yet

---

## 🧠 What I Learned

This was my **first Spring Boot REST API project**, built entirely from scratch by converting an OOP console app.  
Key concepts I learned and applied:

- REST principles: `@RestController`, `@GetMapping`, `@PostMapping`, etc.
- Proper project structuring: model, service, repository layers
- Spring’s dependency injection and bean management
- Clean code and separation of concerns
- Handling edge cases like duplicate books, empty lists, etc.

---

## 🔗 API Endpoints

| Method | Endpoint          | Description                      |
|--------|-------------------|----------------------------------|
| GET    | `/api/books`      | Get all books                    |
| GET    | `/api/books/read` | Get read books                   |
| GET    | `/api/books/unread` | Get unread books              |
| GET    | `/api/books/search?genre={genre}` | Filter by genre  |
| POST   | `/api/books`      | Add a new book                   |
| PATCH  | `/api/books/mark-read?title={title}` | Mark as read |
| PATCH  | `/api/books/mark-unread?title={title}` | Mark as unread |

---

## ✅ Status

🎉 Completed — BookBuddy v1 is a fully working Spring Boot REST API.  
Currently using **in-memory storage**. Will be extended in future versions.

---

## 📂 Folder Structure

---
```
src
└── main
├── java
│ └── com.bookbuddy
│ ├── model # Book.java
│ ├── repository # BookRepository.java
│ ├── service # BookService.java
│ └── controller # BookController.java
└── resources
```

## 📌 Next Steps

This project was built in **just 3 days**. Next version (`bookbuddy-advanced`) will include:

- Persistent database (JPA + H2 or MySQL)
- DTOs and validations
- Exception handling
- JWT authentication
- Unit testing

---

## 🧑‍💻 Author

**Shruti Tiwari**  
Aspiring Java Backend Developer | Learning Spring Boot, JPA, and clean REST API design

---


