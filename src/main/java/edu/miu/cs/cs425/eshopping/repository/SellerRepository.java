package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.Follower;
import edu.miu.cs.cs425.eshopping.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
    @Query(value = "select s from Seller s where s.email = :email")
    Seller findByEmail(String email);

    @Query(value = "select s from Seller s left join fetch s.user")
    List<Seller> getAllSeller();

    //@Query(value = "SELECT s FROM  Seller s  LEFT  JOIN  Follower f  on f.seller.serllerId=s.serllerId  where   " +
    //     " f.seller.serllerId  IS NULL or f.followerStatus=: followerStatus")
    // public List<Seller> findAllBySeller(Long id, Follower.FollowerStatus followerStatus);

    @Query(value = "SELECT s FROM  Seller s  LEFT  JOIN  Follower f  on f.seller.Id=s.Id  where   " +
            " f.seller.Id  IS NULL or f.followerStatus = :followerStatus")
    public List<Seller> findAllBySeller(Follower.FollowerStatus followerStatus);

}