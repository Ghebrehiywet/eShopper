package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.repository.CategoryRepository;
import edu.miu.cs.cs425.eshopping.model.Category;
import edu.miu.cs.cs425.eshopping.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Page<Category> getAllCategoryPages(int pageNo, int size) {
        return categoryRepository.findAll(PageRequest.of(pageNo, size, Sort.by("categoryName")));
    }


    @Override
    public Category createCategory(Category newCategory) {
        return categoryRepository.save(newCategory);
    }


    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findByIdCategory(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category updateCategory(Category editedCategory, Long id) {
        Category catagory = categoryRepository.findById(id).orElse(null);
        if (catagory != null) {
            catagory.setCategoryName(editedCategory.getCategoryName());
            categoryRepository.save(catagory);
        } else {
            categoryRepository.save(editedCategory);
        }
        return editedCategory;
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
