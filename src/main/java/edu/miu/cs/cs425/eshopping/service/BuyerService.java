package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Buyer;

import java.util.List;

public interface BuyerService {

    List<Buyer> findAll();

    List<Buyer> getAllBuyer();

    Buyer save(Buyer buyer);

    Buyer find(Long id);

    Buyer findByEmail(String email);

    Buyer put(Buyer buyer);
}
