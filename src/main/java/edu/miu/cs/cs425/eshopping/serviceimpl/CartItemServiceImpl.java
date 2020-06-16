package edu.miu.cs.cs425.eshopping.serviceimpl;


import edu.miu.cs.cs425.eshopping.model.Buyer;
import edu.miu.cs.cs425.eshopping.model.CartItem;
import edu.miu.cs.cs425.eshopping.model.Item;
import edu.miu.cs.cs425.eshopping.repository.CartItemRepository;
import edu.miu.cs.cs425.eshopping.service.CartItemService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CartItemServiceImpl implements CartItemService {

    private CartItemRepository cartItemRepository;

    public CartItemServiceImpl(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    public List<CartItem> findAll() {
        return cartItemRepository.findAll();
    }

    @Override
    public CartItem save(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public CartItem findById(Long id) {
        return cartItemRepository.findById(id).get();
    }

    @Override
    public CartItem put(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    @Override
    public CartItem findByBuyer(Buyer buyer) {
        return cartItemRepository.findCartItemByBuyer(buyer);
    }

    @Override
    public CartItem findByBuyerAndCartStatus(Buyer buyer, CartItem.CartItemStatus status) {
        return cartItemRepository.findCartItemByBuyerAndCartItemStatus(buyer, status);
    }

    @Override
    public void deleteItem(Item item) {
        CartItem cartItem = cartItemRepository.findById(item.getCartItem().getCartId()).get();
        cartItem.getItem().remove(item);
        cartItemRepository.flush();
    }


}
