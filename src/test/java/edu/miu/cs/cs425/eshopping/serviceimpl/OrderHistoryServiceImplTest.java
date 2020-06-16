//package edu.miu.cs.cs425.eshopping.serviceimpl;
//
//import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
//import edu.miu.cs.cs425.eshopping.model.Buyer;
//import edu.miu.cs.cs425.eshopping.model.Order;
//import edu.miu.cs.cs425.eshopping.service.OrderHistoryService;
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
//public class OrderHistoryServiceImplTest extends AbstractEshoppingComponentTest {
//
//    @Autowired
//    private OrderHistoryService orderHistoryService;
//
//    @Before
//    public void setUp() {
//        logger.info("OrderHistoryServiceImplTest started");
//    }
//
//    @After
//    public void tearDown() {
//        logger.info("OrderHistoryServiceImplTest completed");
//    }
//
//    @Test
//    public void findAllTest() {
//        List<Order> list = orderHistoryService.getAll();
//        Assert.assertNotNull(list);
//        Assert.assertNotEquals(0, list.size());
//        logger.info("List data: " + Arrays.toString(list.toArray()));
//    }
//
//}