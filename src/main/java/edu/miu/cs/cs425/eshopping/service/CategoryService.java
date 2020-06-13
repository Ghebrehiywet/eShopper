package edu.miu.cs.cs425.eshopping.service;


import edu.miu.cs.cs425.eshopping.model.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    Page<Category> getAllCategoryPages(int pageNo, int size);

    public List<Category> getAllCategories();

    public Category createCategory(Category newCategory);

    public abstract Category findByIdCategory(Long id);

    public abstract Category updateCategory(Category edited, Long id);

    public abstract void deleteCategory(Long id);

    ;

}