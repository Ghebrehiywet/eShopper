package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.Buyer;
import edu.miu.cs.cs425.eshopping.model.Follower;
import edu.miu.cs.cs425.eshopping.service.AdminService;
import edu.miu.cs.cs425.eshopping.service.FollowerService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Transactional
public class FollowerServiceImplTest  extends AbstractEshoppingComponentTest {

    @Autowired
    private FollowerService followerService;

    @Before
    public void setUp() {
        logger.info("FollowerServiceImplTest started");
    }

    @After
    public void tearDown() {
        logger.info("FollowerServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<Follower> list = followerService.findAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
        logger.info("List data: " + Arrays.toString(list.toArray()));
    }

}