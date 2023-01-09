package com.jiang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.ContentResultMatchers;
import org.springframework.test.web.servlet.result.HeaderResultMatchers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.result.StatusResultMatchers;

/**
 * @author jiangronghua
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
// 开启虚拟调用MVC调用
@AutoConfigureMockMvc
public class WebTest {
    @Test
    void test() {}

    @Test
    void testWeb(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        mvc.perform(builder);
    }

    @Test
    void testStatus(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);

        // 定义本次调用对预期值
        StatusResultMatchers status = MockMvcResultMatchers.status();
        // 预计本地调用时成功对，状态200
        ResultMatcher ok = status.isOk();
        // 添加预计值到本次调用过程中进行匹配
        action.andExpect(ok);
    }

    @Test
    void testBody(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);

        // 定义本次调用对预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();
        // 预计本地调用时成功对，状态200
        ResultMatcher result = content.string("springboot");
        // 添加预计值到本次调用过程中进行匹配
        action.andExpect(result);
    }

    @Test
    void testJson(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);

        // 定义本次调用对预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();
        // 预计本地调用时成功对，状态200
        ResultMatcher result = content.json("{\"id\":1,\"name\":\"springboot\",\"type\":\"springboot\",\"description\":\"springboot\"}");
        // 添加预计值到本次调用过程中进行匹配
        action.andExpect(result);
    }

    @Test
    void testContentType(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);

        // 定义本次调用对预期值
        HeaderResultMatchers header = MockMvcResultMatchers.header();
        // 预计本地调用时成功对，状态200
        ResultMatcher contentType = header.string("Content-type", "application/json");
        // 添加预计值到本次调用过程中进行匹配
        action.andExpect(contentType);
    }

    @Test
    void testGetById(@Autowired MockMvc mvc) throws Exception {
        MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.get("/books");
        ResultActions action = mvc.perform(builder);

        // 定义本次调用对预期值
        StatusResultMatchers status = MockMvcResultMatchers.status();
        // 预计本地调用时成功对，状态200
        ResultMatcher ok = status.isOk();
        // 添加预计值到本次调用过程中进行匹配
        action.andExpect(ok);

        // 定义本次调用对预期值
        HeaderResultMatchers header = MockMvcResultMatchers.header();
        // 预计本地调用时成功对，状态200
        ResultMatcher contentType = header.string("Content-type", "application/json");
        // 添加预计值到本次调用过程中进行匹配
        action.andExpect(contentType);

        // 定义本次调用对预期值
        ContentResultMatchers content = MockMvcResultMatchers.content();
        // 预计本地调用时成功对，状态200
        ResultMatcher result = content.json("{\"id\":1,\"name\":\"springboot\",\"type\":\"springboot\",\"description\":\"springboot\"}");
        // 添加预计值到本次调用过程中进行匹配
        action.andExpect(result);
    }

}
