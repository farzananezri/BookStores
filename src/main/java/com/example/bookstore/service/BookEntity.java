package com.example.bookstore.service;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bookstore")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    @Column(name = "book_id", nullable = false)
    private Long bookId;

    private String title;
    private String author;
    private Double price;
    private String publisher;
    private String year;


}
