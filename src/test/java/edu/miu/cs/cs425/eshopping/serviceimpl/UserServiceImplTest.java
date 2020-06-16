//package edu.miu.cs.cs425.eshopping.serviceimpl;
//
//import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
//import edu.miu.cs.cs425.eshopping.model.User;
//import edu.miu.cs.cs425.eshopping.service.UserService;
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
//public class UserServiceImplTest extends AbstractEshoppingComponentTest {
//
//    @Autowired
//    private UserService userService;
//
//    @Before
//    public void setUp() {
//        logger.info("UserServiceImplTest started");
//    }
//
//    @After
//    public void tearDown() {
//        logger.info("UserServiceImplTest completed");
//    }
//
//    @Test
//    public void findAllTest() {
//        List<User> list = userService.findAll();
//        Assert.assertNotNull(list);
//        Assert.assertNotEquals(0, list.size());
//        logger.info("List data: " + Arrays.toString(list.toArray()));
//    }
//
//}
