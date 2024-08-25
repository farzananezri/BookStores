package com.example.bookstore.service;

import com.example.bookstore.model.Book;
import com.example.bookstore.model.BookEntity;
import com.example.bookstore.model.BookFEResp;
import jakarta.transaction.Transactional;
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

    public BookFEResp createBook(Book book) {
        BookEntity bookEntity = BookEntity.builder()
                .title(book.getBookTitle())
                .author(book.getAuthor())
                .price(book.getPrice())
                .publisher(book.getPublisher())
                .build();

        try{
            bookRepository.save(bookEntity);
            return BookFEResp.builder().statusCode("000").statusDEscription("Record saved successfully").build();
        }
        catch (Exception e){
            log.info("Error during save {}", e);
            return BookFEResp.builder().statusCode("999").statusDEscription("Error during saving record").build();
        }
    }

    @Override
    @Transactional
    public BookFEResp updateBook(Long id, Book updatedBook) {
        try{
            bookRepository.updateBook(
                    id,
                    updatedBook.getBookTitle(),
                    updatedBook.getAuthor(),
                    updatedBook.getPrice(),
                    updatedBook.getPublisher()
            );

            return BookFEResp.builder().statusCode("000").statusDEscription("Record updated successfully").build();
        }
        catch (Exception e){
            log.info("Error during update {}", e);
            return BookFEResp.builder().statusCode("999").statusDEscription("Error during update record").build();
        }

    }

    public BookFEResp deleteBook(Long id) {
        try{
            bookRepository.deleteById(id);
            return BookFEResp.builder().statusCode("000").statusDEscription("Record deleted successfully").build();
        }
        catch (Exception e){
            log.info("Error during update {}", e);
            return BookFEResp.builder().statusCode("999").statusDEscription("Error during delete record").build();
        }

    }

    @Override
    public List<Book> getAllBookAvailable() {
        List<BookEntity> bookEntities = bookRepository.findAll();
        return bookEntities.stream()
                .map(this::convertToBook)
                .collect(Collectors.toList());
    }

    private Book convertToBook(BookEntity bookEntity) {
        return Book.builder()
                .Id(bookEntity.getBookId())
                .bookTitle(bookEntity.getTitle())
                .author(bookEntity.getAuthor())
                .publisher(bookEntity.getPublisher())
                .price(bookEntity.getPrice())
                .build();
    }
}
