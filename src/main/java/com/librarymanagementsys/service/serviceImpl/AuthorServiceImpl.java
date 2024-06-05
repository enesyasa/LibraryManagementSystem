package com.librarymanagementsys.service.serviceImpl;

import com.librarymanagementsys.core.Message;
import com.librarymanagementsys.core.NotFoundException;
import com.librarymanagementsys.entity.Author;
import com.librarymanagementsys.repository.AuthorRepository;
import com.librarymanagementsys.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpServerErrorException;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Author save(Author author) {
        return authorRepository.save(author);
    }

    @Override
    public Author update(Author author) {
        return authorRepository.saveAndFlush(author);
    }

    @Override
    public Author getById(Long id) {
        return authorRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND_MESSAGE));
    }

    @Override
    public Boolean delete(Long id) {
        if(authorRepository.findById(id).isEmpty()) {
            return false;
        }
        authorRepository.deleteById(id);
        return true;
    }
}
