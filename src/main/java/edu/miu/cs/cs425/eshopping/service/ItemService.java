package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Item;
import edu.miu.cs.cs425.eshopping.model.Product;

import java.util.List;

public interface ItemService {
    List<Item> findAll();

    Item save(Item item);

    Item find(Long id);

    Item put(Item item);

    void delete(Item item);

    void deleteItemByCartItem(Long cartId);

    List<Product> findAllByItemStatusAndProduct(Item.ItemStatus itemStatus, Product product);

    void setItemStatus(Item.ItemStatus itemStatus, Long cartID);
}
