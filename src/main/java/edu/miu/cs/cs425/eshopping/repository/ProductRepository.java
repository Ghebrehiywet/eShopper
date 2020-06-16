package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.Category;
import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT p FROM  Product p WHERE p.category=:category AND p.isAvailable= :isAvailable")
    List<Product> findAllByCategoryAndAvailableIs(Category category, boolean isAvailable);

    @Query(value = "SELECT p FROM  Product p WHERE p.category=:category")
    List<Product> findAllByCategory(Category category);

    @Query(value = "SELECT p FROM  Product p WHERE  p.isAvailable= :isAvailable")
    List<Product> findAllByAvailableIs(boolean isAvailable);

    @Query(value = "SELECT p FROM  Product p WHERE  p.seller= :seller")
    List<Product> findProductBySeller(Seller seller);

    @Modifying
    @Query("DELETE FROM Product p WHERE p.id = ?1")
    void deleteProductById(Long productId);


}
