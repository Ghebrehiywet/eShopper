package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.Admin;
import edu.miu.cs.cs425.eshopping.model.Buyer;
import edu.miu.cs.cs425.eshopping.service.BuyerService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Transactional
public class BuyerServiceImplTest extends AbstractEshoppingComponentTest {
    @Autowired
    private BuyerService buyerService;

    @Before
    public void setUp() {
        logger.info("BuyerServiceImplTest started");
    }

    @After
    public void tearDown() {
        logger.info("BuyerServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<Buyer> list = buyerService.findAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
        logger.info("List data: " + Arrays.toString(list.toArray()));
    }
    @Test
    public void findByEmailTest() {
        Buyer buyer = buyerService.findByEmail("buyer@gmail.com");
        Assert.assertNotNull(buyer);
        Assert.assertEquals("buyer@gmail.com", buyer.getEmail());
    }
}
