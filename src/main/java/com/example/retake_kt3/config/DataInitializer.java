package com.example.retake_kt3.config;

import com.example.retake_kt3.model.Category;
import com.example.retake_kt3.repository.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    public DataInitializer(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) {
        if (categoryRepository.count() == 0) {
            categoryRepository.save(new Category(null, "Высокий"));
            categoryRepository.save(new Category(null, "Средний"));
            categoryRepository.save(new Category(null, "Низкий"));
            System.out.println("Добавлены начальные категории: Высокий, Средний, Низкий");
        }
    }
}