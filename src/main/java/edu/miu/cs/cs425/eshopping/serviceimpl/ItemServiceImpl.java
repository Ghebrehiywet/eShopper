package edu.miu.cs.cs425.eshopping.serviceimpl;


import edu.miu.cs.cs425.eshopping.model.Item;
import edu.miu.cs.cs425.eshopping.model.Product;
import edu.miu.cs.cs425.eshopping.repository.ItemRepository;
import edu.miu.cs.cs425.eshopping.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {


    private ItemRepository itemRepository;

    public ItemServiceImpl() {
    }

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public List<Item> findAll() {
        return (List<Item>) itemRepository.findAll();
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public Item find(Long id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public Item put(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete(Item item) {
        itemRepository.deleteById(item.getId());
    }

    @Override
    public void deleteItemByCartItem(Long cartId) {
        itemRepository.deleteItemByCartItem(cartId);
    }

    @Override
    public List<Product> findAllByItemStatusAndProduct(Item.ItemStatus itemStatus, Product product) {
        return itemRepository.findAllByItemStatusAndProduct(itemStatus, product);
    }

    @Override
    public void setItemStatus(Item.ItemStatus itemStatus, Long cartID) {
        itemRepository.setItemStatus(itemStatus, cartID);
    }


}
