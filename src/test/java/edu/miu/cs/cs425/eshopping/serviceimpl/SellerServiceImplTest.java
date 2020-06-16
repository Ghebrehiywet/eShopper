package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.Admin;
import edu.miu.cs.cs425.eshopping.model.Seller;
import edu.miu.cs.cs425.eshopping.service.SellerService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Transactional
public class SellerServiceImplTest extends AbstractEshoppingComponentTest {

    @Autowired
    private SellerService sellerService;

    @Before
    public void setUp() {
        logger.info("SellerServiceImplTest started");
    }

    @After
    public void tearDown() {
        logger.info("SellerServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<Seller> list = sellerService.findAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
        logger.info("List data: " + Arrays.toString(list.toArray()));
    }

    @Test
    public void findByEmailTest() {
        Seller seller = sellerService.findByEmail("seller@gmail.com");
        Assert.assertNotNull(seller);
        Assert.assertEquals("seller@gmail.com", seller.getEmail());
    }
}
