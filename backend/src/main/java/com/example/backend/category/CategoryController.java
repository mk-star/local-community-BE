package com.example.backend.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
    @Autowired
    public CategorySevice categoryService;

    @GetMapping("/category/{categoryId}")
    public String getCategoryNameById(@PathVariable("categoryId") Long categoryId) {
        return categoryService.getCategoryNameById(categoryId);
    }
}
