package com.librarymanagementsys.service;

import com.librarymanagementsys.entity.Author;

public interface AuthorService {
    Author save(Author author);
    Author update(Author author);
    Author getById(Long id);
    Boolean delete(Long id);
}
