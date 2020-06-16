package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.CartItem;
import edu.miu.cs.cs425.eshopping.service.CartItemService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Transactional
public class CartItemServiceImplTest extends AbstractEshoppingComponentTest {

    @Autowired
    private CartItemService cartItemService;

    @Before
    public void setUp() {
        logger.info("CartItemServiceImplTest started");
    }

    @After
    public void tearDown() {
        logger.info("CartItemServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<CartItem> list = cartItemService.findAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
        logger.info("List data: " + Arrays.toString(list.toArray()));
    }

}
