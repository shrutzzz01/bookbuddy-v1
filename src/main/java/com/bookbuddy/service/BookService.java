package com.bookbuddy.service;

import com.bookbuddy.domain.Book;
import com.bookbuddy.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {
    private final BookRepository repository;

    public BookService(BookRepository repository){
        this.repository=repository;
    }

    public Book addBook(Book book){
        return repository.save(book);
    }
    public List<Book> getAllBooks(){
        return repository.findAll();
    }
    public List<Book> getReadBook(){
        return repository.findByRead(true);
    }
    public List<Book> getUnreadBook(){
        return repository.findByRead(false);
    }
    public List<Book> filterByGenre(String genre){
         return repository.findByGenreIgnoreCase(genre);
    }
    public boolean markBookAsRead(String title){
        Book book=repository.findByTitleContainingIgnoreCase(title);
        if(book!=null){
            book.setRead(true);
            repository.save(book);
            return true;
        }
        return false;
    }
    public boolean markBookAsUnread(String title){
        Book book=repository.findByTitleContainingIgnoreCase(title);
        if(book!=null){
            book.setRead(false);
            repository.save(book);
            return true;
        }
        return false;
    }
}
