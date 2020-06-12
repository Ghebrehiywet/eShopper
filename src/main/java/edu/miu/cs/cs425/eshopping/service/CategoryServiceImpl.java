package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.repository.CategoryRepository;
import edu.miu.cs.cs425.eshopping.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
    @Override
    public Category createCategory(Category newCategory) {
        return categoryRepository.save(newCategory);
    }


    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }

    @Override
    public Category findByIdCategory(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category updateCategory(Category editedCategory, Long id) {
        // Catagory catagory = categoryRepository.findById(id).orElse(null);
        if(categoryRepository.findById(id) != null){
            editedCategory.setCategoryId(id);
            return categoryRepository.save(editedCategory);
        }
        return categoryRepository.save(editedCategory);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.findById(id);


    }
}
