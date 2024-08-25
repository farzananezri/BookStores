# Bookstore Application

## Overview
The Bookstore Application is a simple web application built with Spring Boot that allows users to manage a collection of books. It provides basic CRUD operations such as creating, reading, updating, and deleting books.

## Features
- Add a new book
- View all books
- Update book details
- Delete a book

## Prerequisites
Before you begin, ensure you have met the following requirements:
- Java 17 or higher
- Maven 3.8.1 or higher
- MySQL (or any other relational database of your choice)

## Installation

### 1. Clone the Repository
```bash
git clone https://https://github.com/farzananezri/BookStores.git
cd bookstore-app

### 2. Configure the Database
Create a database in MySQL (or your preferred database) and update the application.properties file located in src/main/resources/ with your database details

### 3. Build the Application
mvn clean install

### 4. Run the Application
mvn spring-boot:run

### API Endpoints
1. /api/getAllBook
URL: /books
Method: GET
Response: JSON array of all books

2. Get all title of book available
URL: /api/getAllBookTitle
Method: GET
Response: List of String of all the title available

3. Create a new book
URL: /books
Method: POST
Request Body: JSON object representing the new book
Response: JSON object of the created book

4. Update a book
URL: /books/{id}
Method: PUT
Request Body: JSON object representing the updated book details
Response: JSON object of the updated book

5. Delete a book
URL: /books/{id}
Method: DELETE
Response: Success message or status
