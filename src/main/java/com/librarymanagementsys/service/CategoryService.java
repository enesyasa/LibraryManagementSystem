package com.librarymanagementsys.service;

import com.librarymanagementsys.entity.Category;

public interface CategoryService {
    Category save(Category category);
    Category update(Category category);
    Category getId(Long id);
    boolean delete(Long id);
}
