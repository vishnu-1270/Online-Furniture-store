/* package com.FSS.FurnitureSaleStore;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FurnitureSaleStoreTests {

    @Autowired
    private MockMvc mockMvc;

    @Test //getsAllProduct
    public void test_case1() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/items")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test //getsAllCart
    public void test_case2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/customers/cart")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();
    }
  

} */

