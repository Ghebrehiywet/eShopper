package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.Order;
import edu.miu.cs.cs425.eshopping.service.OrderService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Transactional
public class OrderServiceImplTest extends AbstractEshoppingComponentTest {

    @Autowired
    private OrderService orderService;

    @Before
    public void setUp() {
        logger.info("OrderServiceImplTest started");
    }

    @After
    public void tearDown() {
        logger.info("OrderServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<Order> list = orderService.getAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
        logger.info("List data: " + Arrays.toString(list.toArray()));
    }

}
