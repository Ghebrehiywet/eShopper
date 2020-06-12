package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.exception.SellerNotFoundException;
import edu.miu.cs.cs425.eshopping.model.Follower;
import edu.miu.cs.cs425.eshopping.model.Seller;

import java.util.List;

public interface SellerService {

    public Seller addSeller(Seller seller);

    public List<Seller> getAll();

    public Seller getSeller(Long id) throws Exception;

    public Seller editSeller(Seller seller);

    public Seller findById(Long id);

    public List<Seller> findAllBySeller(Long id, Follower.FollowerStatus followerStatus);

    public Seller findByEmail(String email) throws SellerNotFoundException;

    public Seller save(Seller seller);

    public Seller find(Long id);

    public Seller put(Seller seller);

    List<Seller> findAll();
}
