package com.librarymanagementsys.service;

import com.librarymanagementsys.entity.BookBorrowing;

public interface BookBorrowingService {
    BookBorrowing save(BookBorrowing bookBorrowing);
    BookBorrowing update(BookBorrowing bookBorrowing);
    BookBorrowing getId(Long id);
    boolean delete(Long id);
}
