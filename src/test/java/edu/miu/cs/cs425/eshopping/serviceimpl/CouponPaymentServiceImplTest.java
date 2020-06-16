//package edu.miu.cs.cs425.eshopping.serviceimpl;
//
//import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
//import edu.miu.cs.cs425.eshopping.model.CouponPayment;
//import edu.miu.cs.cs425.eshopping.service.CouponPaymentService;
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
//public class CouponPaymentServiceImplTest extends AbstractEshoppingComponentTest {
//
//    @Autowired
//    private CouponPaymentService couponPaymentService;
//
//    @Before
//    public void setUp() {
//        logger.info("CouponPaymentServiceImplTest started");
//    }
//
//    @After
//    public void tearDown() {
//        logger.info("CouponPaymentServiceImplTest completed");
//    }
//
//    @Test
//    public void findAllTest() {
//        List<CouponPayment> list = couponPaymentService.getAll();
//        Assert.assertNotNull(list);
//        Assert.assertNotEquals(0, list.size());
//        logger.info("List data: " + Arrays.toString(list.toArray()));
//    }
//
//}