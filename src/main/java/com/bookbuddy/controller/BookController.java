package com.bookbuddy.controller;

import com.bookbuddy.domain.Book;
import com.bookbuddy.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.*;

@RestController
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService=bookService;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBook(@RequestBody @Valid Book book){
        return bookService.addBook(book);
    }
    @GetMapping
    public List<Book> all(){
        return bookService.getAllBooks();
    }
    @GetMapping("/read")
    public List<Book> readBooks(){
        return bookService.getReadBook();
    }
    @GetMapping("/unread")
    public List<Book> unreadBooks(){
        return bookService.getUnreadBook();
    }
    @GetMapping("/genre")
    public List<Book> byGenre(@RequestParam String genre){
        return bookService.filterByGenre(genre);
    }
    @PatchMapping("/mark-read")
    public boolean markRead(@RequestParam String title){
        return bookService.markBookAsRead(title);
    }
    public boolean markUnread(@RequestParam String title){
        return bookService.markBookAsUnread(title);
    }
}
