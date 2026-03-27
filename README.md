# Greeting App (Spring Boot REST API)

## Project Description

This is a simple Spring Boot REST API application that provides greeting messages and supports full CRUD (Create, Read, Update, Delete) operations.

The application is built using a layered architecture with Controller and Service layers, and stores data in-memory using a list.

---

## Features

* Get default greeting message
* Get personalized greeting using first name and/or last name
* Save greeting messages
* Retrieve greeting by ID
* Retrieve all greetings
* Update greeting message
* Delete greeting message

---

## Technologies Used

* Java
* Spring Boot
* Maven
* REST API
* IntelliJ IDEA

---

## Project Structure

```
com.example.demo
│
├── controller
│   └── GreetingController.java
│
├── service
│   └── GreetingService.java
│
├── model
│   └── Greeting.java
│
└── DemoApplication.java
```

---

## API Endpoints

### 1. Get Default Greeting

```
GET /greeting
```

### 2. Get Custom Greeting

```
GET /greeting/custom?firstName=John&lastName=Doe
```

### 3. Save Greeting

```
POST /greeting/save?message=HelloWorld
```

### 4. Get Greeting by ID

```
GET /greeting/{id}
```

### 5. Get All Greetings

```
GET /greeting/all
```

### 6. Update Greeting

```
PUT /greeting/update/{id}?message=NewMessage
```

### 7. Delete Greeting

```
DELETE /greeting/delete/{id}
```

---

## Note

* This application uses in-memory storage (ArrayList).
* Data will be lost when the application restarts.

---

## How to Run

1. Clone the repository
2. Open in IntelliJ IDEA
3. Run `DemoApplication.java`
4. Access APIs using browser or Postman

---
