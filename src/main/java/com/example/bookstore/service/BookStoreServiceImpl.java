package com.example.bookstore.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class BookStoreServiceImpl implements BookStoreService{

    private final BookRepository bookRepository;

    @Autowired
    public BookStoreServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public List<String> getAllBookTitle() {

        List<BookEntity> bookEntityList = bookRepository.findAllBy();
        List<String> allTitle =  bookEntityList.stream().map(BookEntity :: getTitle).sorted().collect(Collectors.toList());

        return allTitle;
    }
}
