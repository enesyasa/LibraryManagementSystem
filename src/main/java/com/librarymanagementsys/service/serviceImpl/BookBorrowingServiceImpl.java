package com.librarymanagementsys.service.serviceImpl;

import com.librarymanagementsys.core.Message;
import com.librarymanagementsys.core.NotFoundException;
import com.librarymanagementsys.entity.BookBorrowing;
import com.librarymanagementsys.repository.BookBorrowingRepository;
import com.librarymanagementsys.service.BookBorrowingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookBorrowingServiceImpl implements BookBorrowingService {
    private final BookBorrowingRepository bookBorrowingRepository;

    @Override
    public BookBorrowing save(BookBorrowing bookBorrowing) {
        return bookBorrowingRepository.save(bookBorrowing);
    }

    @Override
    public BookBorrowing update(BookBorrowing bookBorrowing) {
        return bookBorrowingRepository.saveAndFlush(bookBorrowing);
    }

    @Override
    public BookBorrowing getId(Long id) {
        return bookBorrowingRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND_MESSAGE));
    }

    @Override
    public boolean delete(Long id) {
        if(bookBorrowingRepository.findById(id).isEmpty()) {
            return false;
        }
        bookBorrowingRepository.deleteById(id);
        return true;
    }
}
