package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Buyer;

import java.util.List;

public interface BuyerService {

    public List<Buyer> findAll();
    public List<Buyer> getAllBuyer();
    public Buyer save(Buyer buyer);
    public Buyer find(Long id);
    public Buyer findByEmail(String email  );
    public Buyer put(Buyer buyer);
}
