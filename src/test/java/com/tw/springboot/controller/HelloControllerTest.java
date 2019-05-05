package com.tw.springboot.controller;

import com.tw.springboot.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
@AutoConfigureMockMvc
public class HelloControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void helloGradle() throws Exception {
        rangeCheck(10);
        mvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello Gradle!"));
    }

    private int size;

    private void rangeCheck1(int index) {
        if (index >= size)
            throw new RuntimeException();
    }

    private void rangeCheck(int index) {
        if (index >= size)
            throw new RuntimeException();
    }
}