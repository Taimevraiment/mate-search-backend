package com.taim.matesearch.service;

import com.taim.matesearch.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * Redis 测试
 *
 * @author taim
 */
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("taimString", "dog");
        valueOperations.set("taimInt", 1);
        valueOperations.set("taimDouble", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("taim");
        valueOperations.set("taimUser", user);
        // 查
        Object taim = valueOperations.get("taimString");
        Assertions.assertTrue("dog".equals((String) taim));
        taim = valueOperations.get("taimInt");
        Assertions.assertTrue(1 == (Integer) taim);
        taim = valueOperations.get("taimDouble");
        Assertions.assertTrue(2.0 == (Double) taim);
        System.out.println(valueOperations.get("taimUser"));
        valueOperations.set("taimString", "dog");
        redisTemplate.delete("taimString");
    }

}
