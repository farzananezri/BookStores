package com.example.bookstore.controller;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookFEResp;
import com.example.bookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookStoreController {

    @Autowired
    BookStoreService bookStoreService;

    @GetMapping("/getAllBookTitle")
    public List<String> getAllBookTitle(){
        return bookStoreService.getAllBookTitle();
    }

    // Create a new book
    @PostMapping("/create")
    public BookFEResp createBook(@RequestBody Book book) {
        return bookStoreService.createBook(book);
    }

    // Update an existing book
    @PutMapping("/update/{id}")
    public BookFEResp updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookStoreService.updateBook(id, book);
    }

    // Delete a book
    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookStoreService.deleteBook(id);
    }
}
