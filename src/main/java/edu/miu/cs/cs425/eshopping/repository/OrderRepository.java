
package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    @Query(value = "SELECT o FROM  Orders o Join o.cartItem c join c.item i join i.product p WHERE p.seller.email = :username")
    List<Order> getAllBySeller(String username);

    @Query(value = "SELECT o FROM  Orders o  WHERE  o.cartItem.buyer.email = :username")
    List<Order> getAllByBuyer(String username);

}
