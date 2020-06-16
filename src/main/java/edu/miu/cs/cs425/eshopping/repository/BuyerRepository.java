package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.Buyer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {

     Buyer findByEmail(String email);
    @Query(value = "select b from Buyer b left join fetch b.user")
    List<Buyer> getAllBuyer();



}
