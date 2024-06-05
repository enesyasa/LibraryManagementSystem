package com.librarymanagementsys.service;

import com.librarymanagementsys.entity.Book;

public interface BookService {
    Book save(Book Book);
    Book update(Book Book);
    Book getId(Long id);
    boolean delete(Long id);
}
