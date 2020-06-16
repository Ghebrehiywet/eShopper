package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.Buyer;
import edu.miu.cs.cs425.eshopping.model.Payment;
import edu.miu.cs.cs425.eshopping.service.PaymentService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Transactional
public class PaymentServiceImplTest extends AbstractEshoppingComponentTest {

    @Autowired
    private PaymentService paymentService;

    @Before
    public void setUp() {
        logger.info("PaymentServiceImplTest started");
    }

    @After
    public void tearDown() {
        logger.info("PaymentServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<Payment> list = paymentService.getAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
        logger.info("List data: " + Arrays.toString(list.toArray()));
    }

}
