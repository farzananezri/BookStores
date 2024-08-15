package com.example.bookstore.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookStoreService {

    List<String> getAllBookTitle();
}
