package com.deepu.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest(properties = {
        "weather.api.key=dummy"
})
public class EmailServiceTests {

    @MockBean
    private JavaMailSender javaMailSender;

    @Autowired
    private EmailService emailService;

    @Test
    void testSendEmail(){
        emailService.sendEmail("deepukumarr52488@gmail.com",
                "Testing java mail sender",
                "Hi, app kese hain");
    }
}
