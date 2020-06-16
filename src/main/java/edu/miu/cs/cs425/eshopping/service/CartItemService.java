package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Buyer;
import edu.miu.cs.cs425.eshopping.model.CartItem;
import edu.miu.cs.cs425.eshopping.model.Item;

import java.util.List;


public interface CartItemService {
    List<CartItem> findAll();

    CartItem save(CartItem cartItem);

    CartItem findById(Long id);

    CartItem put(CartItem cartItem);

    CartItem findByBuyer(Buyer buyer);

    CartItem findByBuyerAndCartStatus(Buyer buyer, CartItem.CartItemStatus status);

    void deleteItem(Item item);


}
