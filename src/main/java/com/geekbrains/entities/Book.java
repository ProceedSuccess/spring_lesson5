package com.geekbrains.entities;

import org.hibernate.annotations.Cascade;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "books")
public class Book {
    public Book(){}
// Id, название книги, короткое описание, год выпуска
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_name")
    private String book_name;

    @Column(name = "description")
    private String description;

    @Column(name = "year_of_issue")
    private int year_of_issue;

    public Long getId() {
        return id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getDescription() {
        return description;
    }

    public int getYear_of_issue() {
        return year_of_issue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBook_name(String name) {
        this.book_name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setYear_of_issue(int year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    @Override
    public String toString() {
        return "Book id=" + id + ", name" + book_name + ", year " + year_of_issue + '}';
    }
}
