package com.atguigu.springcloud;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.ZonedDateTime;

@SpringBootTest
class CloudGatewayGateway9527ApplicationTests {

    @Test
    void contextLoads()
    {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
    }

}
