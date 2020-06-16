package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.Buyer;
import edu.miu.cs.cs425.eshopping.model.Review;
import edu.miu.cs.cs425.eshopping.service.ReviewService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Transactional
public class ReviewServiceImplTest extends AbstractEshoppingComponentTest {

    @Autowired
    private ReviewService reviewService;

    @Before
    public void setUp() {
        logger.info("ReviewServiceImplTest started");
    }

    @After
    public void tearDown() {
        logger.info("ReviewServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<Review> list = reviewService.findAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
        logger.info("List data: " + Arrays.toString(list.toArray()));
    }

}
