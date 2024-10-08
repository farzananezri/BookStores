package com.example.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private Long Id;
    private String bookTitle;
    private String author;
    private Double price;
    private String publisher;
}
