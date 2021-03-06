package com.velco.testtechnique;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.CoreMatchers.is;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TestTechniqueControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetReferences() throws Exception{
        mockMvc.perform(get("/references"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[2].numReference", is(1462100403)))
                .andExpect(jsonPath("$[5].line", is(4)));

    }
}
