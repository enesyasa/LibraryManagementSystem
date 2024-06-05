package com.librarymanagementsys.service.serviceImpl;

import com.librarymanagementsys.core.Message;
import com.librarymanagementsys.core.NotFoundException;
import com.librarymanagementsys.entity.Publisher;
import com.librarymanagementsys.repository.PublisherRepository;
import com.librarymanagementsys.service.PublisherService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepository publisherRepository;

    @Override
    public Publisher save(Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @Override
    public Publisher update(Publisher publisher) {
        return publisherRepository.saveAndFlush(publisher);
    }

    @Override
    public Publisher getId(Long id) {
        return publisherRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND_MESSAGE));
    }

    @Override
    public boolean delete(Long id) {
        if(publisherRepository.findById(id).isEmpty()) {
            return false;
        }
        publisherRepository.deleteById(id);
        return true;
    }
}
