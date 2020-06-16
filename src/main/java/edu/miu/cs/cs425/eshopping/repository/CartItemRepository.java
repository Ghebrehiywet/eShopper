package edu.miu.cs.cs425.eshopping.repository;

import edu.miu.cs.cs425.eshopping.model.Buyer;
import edu.miu.cs.cs425.eshopping.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findCartItemByBuyer(Buyer buyer);

    CartItem findCartItemByBuyerAndCartItemStatus(Buyer buyer, CartItem.CartItemStatus status);

}
