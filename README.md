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

## 1. Clone the Repository
git clone [https://https://github.com/farzananezri/BookStores.git](https://github.com/farzananezri/BookStores.git)
cd bookstore-app

## 2. Configure the Database
 1. Create a database in MySQL (or your preferred database) and update the application.properties file located in src/main/resources/ with your database details
 2. Go to file demobook.sql , to create table and insert data

## 3. Build the Application
mvn clean install

## 4. Run the Application
mvn spring-boot:run

## API Endpoints

1. Get all book available
 URL: /api/getAllBook
 Method: GET
 Response: JSON array of all books

2. Get all title of book available
 URL: /api/getAllBookTitle
 Method: GET
 Response: List of String of all the title available

3. Create a new book
 URL: /api/create
 Method: POST
 Request Body: JSON object representing the new book
 Response: Success message or status

4. Update a book
 URL: /api/update/{id}
 Method: PUT
 Request Body: JSON object representing the updated book details
 Response: Success message or status

5. Delete a book
 URL: /api/delete/{id}
 Method: DELETE
 Response: Success message or status
