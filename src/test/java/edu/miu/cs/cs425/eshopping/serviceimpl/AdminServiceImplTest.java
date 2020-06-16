package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.Admin;
import edu.miu.cs.cs425.eshopping.service.AdminService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class AdminServiceImplTest extends AbstractEshoppingComponentTest {

    @Autowired
    private AdminService adminService;

    @Before
    public void setUp() {
//        logger.info("AdminServiceImplTest started");
    }

    @After
    public void tearDown() {
//        logger.info("AdminServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<Admin> list = adminService.findAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
//        logger.info("List data: " + Arrays.toString(list.toArray()));
    }

    @Test
    public void saveAdminsTest() {
        Admin admin = new Admin();
        Admin adminSaved = adminService.save(admin);
        Assert.assertNotNull(adminSaved);
//        Assert.assertNotEquals(0, admins.size());
    }

    @Test
    public void findByEmailTest() {
        Admin admin = adminService.findByEmail("admin@gmail.com");
        Assert.assertNotNull(admin);
        Assert.assertEquals("admin@gmail.com", admin.getEmail());
    }

    @Test
    public void putAdminTest() {
        Admin admin = new Admin();
        Admin admins = adminService.put(admin);
        Assert.assertNotNull(admins);
//        Assert.assertNotEquals(0, admins.size());
    }


}
