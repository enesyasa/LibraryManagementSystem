package com.librarymanagementsys.service.serviceImpl;

import com.librarymanagementsys.core.Message;
import com.librarymanagementsys.core.NotFoundException;
import com.librarymanagementsys.entity.Book;
import com.librarymanagementsys.repository.BookRepository;
import com.librarymanagementsys.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.saveAndFlush(book);
    }

    @Override
    public Book getId(Long id) {
        return bookRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND_MESSAGE));
    }

    @Override
    public boolean delete(Long id) {
        if(bookRepository.findById(id).isEmpty()) {
            return false;
        }
        bookRepository.deleteById(id);
        return true;
    }
}
