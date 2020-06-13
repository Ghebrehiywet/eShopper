package edu.miu.cs.cs425.eshopping.service;

import edu.miu.cs.cs425.eshopping.model.Item;

public interface ItemService {
        Item getItem(Long id);
        Item saveItem(Item item);
        void deleteItem(Long id);
}
