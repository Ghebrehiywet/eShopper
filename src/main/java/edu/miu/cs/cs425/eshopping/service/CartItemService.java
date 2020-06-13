package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.CartItem;

public interface CartItemService {
    CartItem getCartItem();
    CartItem saveCartItem(CartItem cartItem);
    CartItem deleteCart(Long id);
}
