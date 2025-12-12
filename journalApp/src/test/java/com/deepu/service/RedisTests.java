package com.deepu.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest(properties = {
        "weather.api.key=dummy"
})
public class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @MockBean
    private JavaMailSender javaMailSender;

    @Disabled
    @Test
    void testSendEmail(){
        redisTemplate.opsForValue().set("email","deepak@gmail.com");
        Object email = redisTemplate.opsForValue().get("salary");
        int a = 1;
    }
}
