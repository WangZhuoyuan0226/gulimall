package com.tongji.gulimall.coupon;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;

import java.io.FileNotFoundException;

@SpringBootTest
class GulimallCouponApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void classpathTest() throws FileNotFoundException {
        String str1 = ClassUtils.getDefaultClassLoader().getResource("").getPath();
        String str2 = ResourceUtils.getURL("classpath:").getPath();
        String str3 = System.getProperty("user.dir");
        System.out.println(str3);
    }

}
