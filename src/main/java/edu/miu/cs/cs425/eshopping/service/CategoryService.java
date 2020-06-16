package edu.miu.cs.cs425.eshopping.service;


import edu.miu.cs.cs425.eshopping.model.Category;
import edu.miu.cs.cs425.eshopping.model.Product;

import java.util.List;

public interface CategoryService {
    public List<Category> findAll();

    public Category save(Category category);

    public Category findById(Long id);

    public Category put(Category category);

    public void deleteProduct(Product product);

    public void delete(Category category);

}
