package edu.miu.cs.cs425.eshopping.service;


import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.model.Review;
import edu.miu.cs.cs425.eshopping.model.ReviewStatus;

import java.util.List;

public interface ReviewService {
    public List<Review> findAll();
    public Review save(Review review);
    public Review find(Long id);
    public Review put(Review review);
    public void delete(Review review);
    public List<Review> findAllByProduct(Product product);
    public List<Review> findAllByProductAndReviewStatus(Product product, ReviewStatus reviewStatus);


}
