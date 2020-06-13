package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.model.CartItem;
import edu.miu.cs.cs425.eshopping.repository.CartItemRepository;
import edu.miu.cs.cs425.eshopping.service.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemServiceImpl implements CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    @Override
    public CartItem getCartItem(){
        return cartItemRepository.findByCartItemStatus(CartItem.CartItemStatus.Created);
    }

    @Override
    public CartItem saveCartItem(CartItem cartItem) {
        return null;
    }

    @Override
    public CartItem deleteCart(Long id) {
        return null;
    }
}
