package edu.miu.cs.cs425.eshopping.serviceimpl;


import edu.miu.cs.cs425.eshopping.model.Category;
import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.repository.CategoryRepository;
import edu.miu.cs.cs425.eshopping.service.CategoryService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    private CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category put(Category category) {
        Category existing = findById(category.getCategoryId());
        if (existing == null) {
            return categoryRepository.save(category);
        } else {
            existing.setCategoryName(category.getCategoryName());
            return categoryRepository.save(existing);
        }
    }


    @Override
    public void deleteProduct(Product product) {
        System.out.println("*******************inside delete " + product);
        Category category = categoryRepository.findById(product.getCategory().getCategoryId()).get();
        System.out.println("*******************inside delete " + category);
        category.getProducts().remove(product);
        categoryRepository.flush();
    }

    @Override
    public void delete(Category category) {
        categoryRepository.delete(category);
    }

}
