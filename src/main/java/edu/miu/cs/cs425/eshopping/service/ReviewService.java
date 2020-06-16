package edu.miu.cs.cs425.eshopping.service;


import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.model.Review;
import edu.miu.cs.cs425.eshopping.model.ReviewStatus;

import java.util.List;

public interface ReviewService {
    List<Review> findAll();

    Review save(Review review);

    Review find(Long id);

    Review put(Review review);

    void delete(Review review);

    List<Review> findAllByProduct(Product product);

    List<Review> findAllByProductAndReviewStatus(Product product, ReviewStatus reviewStatus);


}
