package edu.miu.cs.cs425.eshopping.serviceimpl;


import edu.miu.cs.cs425.eshopping.model.Category;
import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.model.Seller;
import edu.miu.cs.cs425.eshopping.repository.ProductRepository;
import edu.miu.cs.cs425.eshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {


    private ProductRepository productRepository;

    public ProductServiceImpl() {
    }

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product find(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> findByCategory(Category category) {
        return null;
    }

    @Override
    public Product put(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAllByCategoryAndAvailable(Category category, boolean isAvailable) {
        return productRepository.findAllByCategoryAndAvailableIs(category, isAvailable);
    }

    @Override
    public List<Product> findAllByCategory(Category category) {
        return productRepository.findAllByCategory(category);
    }

    @Override
    public List<Product> findAllByAvailable(boolean isAvailable) {
        return productRepository.findAllByAvailableIs(isAvailable);
    }

    @Override
    public List<Product> findProductBySeller(Seller seller) {
        return productRepository.findProductBySeller(seller);
    }

    @Override
    public void delete(Product product) {
        productRepository.delete(product);
    }

    @Override
    public void deleteProductById(Long id) {
        productRepository.deleteProductById(id);
    }

}
