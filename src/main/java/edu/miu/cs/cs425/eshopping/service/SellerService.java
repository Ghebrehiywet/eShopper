package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.exception.SellerNotFoundException;
import edu.miu.cs.cs425.eshopping.model.Follower;
import edu.miu.cs.cs425.eshopping.model.Seller;

import java.util.List;

public interface SellerService {

    Seller addSeller(Seller seller);

    List<Seller> getAll();

    Seller getSeller(Long id) throws Exception;

    Seller editSeller(Seller seller);

    Seller findById(Long id);

    List<Seller> findAllBySeller(Long id, Follower.FollowerStatus followerStatus);

    Seller findByEmail(String email) throws SellerNotFoundException;

    Seller save(Seller seller);

    Seller find(Long id);

    Seller put(Seller seller);

    List<Seller> findAll();
}
