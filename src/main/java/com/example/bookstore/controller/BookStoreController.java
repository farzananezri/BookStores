package com.example.bookstore.controller;

import com.example.bookstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
