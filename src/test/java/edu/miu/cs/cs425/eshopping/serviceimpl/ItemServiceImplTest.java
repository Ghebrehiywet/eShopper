package edu.miu.cs.cs425.eshopping.serviceimpl;

import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
import edu.miu.cs.cs425.eshopping.model.Item;
import edu.miu.cs.cs425.eshopping.service.ItemService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

@Transactional
public class ItemServiceImplTest extends AbstractEshoppingComponentTest {

    @Autowired
    private ItemService itemService;

    @Before
    public void setUp() {
        logger.info("ItemServiceImplTest started");
    }

    @After
    public void tearDown() {
        logger.info("ItemServiceImplTest completed");
    }

    @Test
    public void findAllTest() {
        List<Item> list = itemService.findAll();
        Assert.assertNotNull(list);
        Assert.assertNotEquals(0, list.size());
        logger.info("List data: " + Arrays.toString(list.toArray()));
    }

}