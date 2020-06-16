package edu.miu.cs.cs425.eshopping.service;


import edu.miu.cs.cs425.eshopping.model.Follower;
import edu.miu.cs.cs425.eshopping.model.Seller;

import java.util.List;

public interface FollowerService {
    public List<Follower> findAll();

    public Follower save(Follower follower);

    public Follower find(Long id);

    public Follower put(Follower follower);

    public void delete(Follower follower);

    public List<Seller> findAllBySeller(Long Id);

    public List<Seller> findAllByProductAndReviewStatus(Follower.FollowerStatus followerStatus, Long id);

    public Follower findFollowerByBuyerAndAndSeller(Long sellerId, Long buyerId);


}
