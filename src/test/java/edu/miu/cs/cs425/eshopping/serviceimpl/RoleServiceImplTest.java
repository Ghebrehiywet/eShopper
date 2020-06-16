//package edu.miu.cs.cs425.eshopping.serviceimpl;
//
//import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
//import edu.miu.cs.cs425.eshopping.model.Role;
//import edu.miu.cs.cs425.eshopping.service.RoleService;
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
//public class RoleServiceImplTest extends AbstractEshoppingComponentTest {
//
//    @Autowired
//    private RoleService roleService;
//
//    @Before
//    public void setUp() {
//        logger.info("RoleServiceImplTest started");
//    }
//
//    @After
//    public void tearDown() {
//        logger.info("RoleServiceImplTest completed");
//    }
//
//    @Test
//    public void findAllTest() {
//        List<Role> list = roleService.findAll();
//        Assert.assertNotNull(list);
//        Assert.assertNotEquals(0, list.size());
//        logger.info("List data: " + Arrays.toString(list.toArray()));
//    }
//
//}
