package com.bookbuddy.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import javax.annotation.processing.Generated;
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message="Title must not be blank")
    @Column(unique = true)
    private String title;

    @NotBlank(message="Author must not be blank")
    private String author;

    @NotBlank(message="Genre must not be blank")
    private String genre;

    private boolean read;

    protected Book() {
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='"  + title  + '\'' +
                ", author='" + author + '\'' +
                ", genre='"  + genre  + '\'' +
                ", read="    + read   +
                '}';
    }
}
