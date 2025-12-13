package com.deepu.cron;

import com.deepu.scheduler.UserScheduler;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mail.javamail.JavaMailSender;

@SpringBootTest(properties = {
        "weather.api.key=dummy"
})
public class UserSchedulersTest {
    @Autowired
    private UserScheduler userScheduler;

    @MockBean
    private JavaMailSender javaMailSender;

    @Test
    public void testFetchUsersAndSendSaMail(){
        userScheduler.fetchUsersAndSendSaMail();
    }
}
