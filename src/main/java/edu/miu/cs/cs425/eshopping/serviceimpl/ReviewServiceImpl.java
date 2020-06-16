package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.model.Review;
import edu.miu.cs.cs425.eshopping.model.ReviewStatus;
import edu.miu.cs.cs425.eshopping.repository.ReviewRepository;
import edu.miu.cs.cs425.eshopping.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @Override
    public List<Review> findAll() {
        return (List<Review>) reviewRepository.findAll();
    }

    @Override
    public Review save(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public Review find(Long id) {
        return reviewRepository.findById(id).get();
    }

    @Override
    public Review put(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public void delete(Review review) {
        reviewRepository.delete(review);
    }

    @Override
    public List<Review> findAllByProduct(Product product) {
        return reviewRepository.findAllByProduct(product);


    }

    @Override
    public List<Review> findAllByProductAndReviewStatus(Product product, ReviewStatus reviewStatus) {
        return reviewRepository.findAllByProductAndReviewStatus(product, reviewStatus);

    }
}
