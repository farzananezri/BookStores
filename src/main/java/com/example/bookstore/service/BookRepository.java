package com.example.bookstore.service;

import com.example.bookstore.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

    List<BookEntity> findAllBy();

    @Modifying
    @Query("UPDATE BookEntity b SET " +
            "b.title = COALESCE(:title, b.title), " +
            "b.author = COALESCE(:author, b.author), " +
            "b.price = COALESCE(:price, b.price), " +
            "b.publisher = COALESCE(:publisher, b.publisher) " +
            "WHERE b.id = :id")
    void updateBook(@Param("id") Long id,
                    @Param("title") String title,
                    @Param("author") String author,
                    @Param("price") Double price,
                    @Param("publisher") String publisher);
}