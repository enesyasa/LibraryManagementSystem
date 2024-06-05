package com.librarymanagementsys.service.serviceImpl;

import com.librarymanagementsys.core.Message;
import com.librarymanagementsys.core.NotFoundException;
import com.librarymanagementsys.entity.Category;
import com.librarymanagementsys.repository.CategoryRepository;
import com.librarymanagementsys.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category update(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    public Category getId(Long id) {
        return categoryRepository.findById(id).orElseThrow(() -> new NotFoundException(Message.NOT_FOUND_MESSAGE));
    }

    @Override
    public boolean delete(Long id) {
        if(categoryRepository.findById(id).isEmpty()) {
            return false;
        }
        categoryRepository.deleteById(id);
        return true;
    }
}
