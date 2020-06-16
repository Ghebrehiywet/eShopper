package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.model.Review;
import edu.miu.cs.cs425.eshopping.model.ReviewStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

    @Query(value = "SELECT r FROM  Review r WHERE r.product=:product ")
    List<Review> findAllByProduct(Product product);


    @Query(value = "SELECT r FROM  Review r WHERE r.product=:product  AND r.reviewStatus=:reviewStatus")
    List<Review> findAllByProductAndReviewStatus(Product product, ReviewStatus reviewStatus);

}

