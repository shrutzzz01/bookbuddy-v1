package com.bookbuddy.repository;

import com.bookbuddy.domain.Book;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
public interface BookRepository extends JpaRepository<Book, Long>{
    List<Book> findByRead(boolean read);

    Book findByTitleContainingIgnoreCase(String title);

    List<Book> findByGenreIgnoreCase(String genre);
}
