package com.librarymanagementsys.service;

import com.librarymanagementsys.entity.Publisher;

public interface PublisherService {
    Publisher save(Publisher publisher);
    Publisher update(Publisher publisher);
    Publisher getId(Long id);
    boolean delete(Long id);
}
