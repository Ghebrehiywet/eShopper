//package edu.miu.cs.cs425.eshopping.serviceimpl;
//
//import edu.miu.cs.cs425.eshopping.AbstractEshoppingComponentTest;
//import edu.miu.cs.cs425.eshopping.model.Category;
//import edu.miu.cs.cs425.eshopping.service.CategoryService;
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
//public class CategoryServiceImplTest extends AbstractEshoppingComponentTest {
//
//    @Autowired
//    private CategoryService categoryService;
//
//    @Before
//    public void setUp() {
//        logger.info("CategoryServiceImplTest started");
//    }
//
//    @After
//    public void tearDown() {
//        logger.info("CategoryServiceImplTest completed");
//    }
//
//    @Test
//    public void findAllTest() {
//        List<Category> list = categoryService.findAll();
//        Assert.assertNotNull(list);
//        Assert.assertNotEquals(0, list.size());
//        logger.info("List data: " + Arrays.toString(list.toArray()));
//    }
//
//}