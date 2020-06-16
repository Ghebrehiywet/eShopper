//package edu.miu.cs.cs425.eshopping.serviceimpl;
//
//import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
//import edu.miu.cs.cs425.eshopping.model.Notification;
//import edu.miu.cs.cs425.eshopping.service.NotificationService;
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
//public class NotificationServiceImplTest extends AbstractEshoppingComponentTest {
//
//    @Autowired
//    private NotificationService notificationService;
//
//    @Before
//    public void setUp() {
//        logger.info("NotificationServiceImplTest started");
//    }
//
//    @After
//    public void tearDown() {
//        logger.info("NotificationServiceImplTest completed");
//    }
//
//    @Test
//    public void findAllTest() {
//        List<Notification> list = notificationService.getAll();
//        Assert.assertNotNull(list);
//        Assert.assertNotEquals(0, list.size());
//        logger.info("List data: " + Arrays.toString(list.toArray()));
//    }
//
//}
