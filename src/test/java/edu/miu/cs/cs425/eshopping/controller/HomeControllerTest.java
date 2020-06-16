//package edu.miu.cs.cs425.eshopping.controller;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(HomeController.class)
//@WebAppConfiguration
//
//public class HomeControllerTest {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Test
//    public void testDisplayHomePage() throws Exception {
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("home"))
//                .andExpect(content().string(
//                        containsString("Welcome to ESGY Online Shopping"))
//                );
//    }
//}