//package edu.miu.cs.cs425.eshopping.serviceimpl;
//
//import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
//import edu.miu.cs.cs425.eshopping.model.Buyer;
//import edu.miu.cs.cs425.eshopping.model.Product;
//import edu.miu.cs.cs425.eshopping.service.ProductService;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import javax.transaction.Transactional;
//import java.util.Arrays;
//import java.util.List;
//
//@Transactional
//public class ProductServiceImplTest extends AbstractEshoppingComponentTest {
//
//    @Autowired
//    private ProductService productService;
//
//    @Before
//    public void setUp() {
//        logger.info("ProductServiceImplTest started");
//    }
//
//    @After
//    public void tearDown() {
//        logger.info("ProductServiceImplTest completed");
//    }
//
//    @Test
//    public void findAllTest() {
//        List<Product> list = productService.findAll();
//        Assert.assertNotNull(list);
//        Assert.assertNotEquals(0, list.size());
//        logger.info("List data: " + Arrays.toString(list.toArray()));
//    }
//
//}
