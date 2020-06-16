package edu.miu.cs.cs425.eshopping.service;


import edu.miu.cs.cs425.eshopping.model.Category;
import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.model.Seller;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product save(Product product);

    Product find(Long id);

    List<Product> findByCategory(Category category);

    Product put(Product product);

    List<Product> findAllByCategoryAndAvailable(Category category, boolean isAvailable);

    List<Product> findAllByCategory(Category category);

    List<Product> findAllByAvailable(boolean isAvailable);

    List<Product> findProductBySeller(Seller seller);

    void delete(Product product);

    void deleteProductById(Long id);

}
