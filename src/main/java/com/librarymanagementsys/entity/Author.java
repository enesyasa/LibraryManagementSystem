package com.librarymanagementsys.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long id;

    @Column(name = "author_name",nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "author_birthday",nullable = false)
    private LocalDate year;

    @Column(name = "author_country",nullable = false)
    private String country;

    @OneToMany(mappedBy = "author",cascade = CascadeType.REMOVE)
    private List<Book> bookList;

}
