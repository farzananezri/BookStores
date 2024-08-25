package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookFEResp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookStoreService {

    List<String> getAllBookTitle();

    BookFEResp createBook(Book book);

    BookFEResp updateBook(Long id, Book updatedBook);

    BookFEResp deleteBook(Long id);

    List<Book> getAllBookAvailable();
}
