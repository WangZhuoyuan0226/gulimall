package com.tongji.gulimall.member;

import com.tongji.common.utils.R;
import com.tongji.gulimall.member.entity.MemberEntity;
import com.tongji.gulimall.member.feign.CouponFeignService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallMemberApplicationTests {

    @Autowired
    CouponFeignService couponFeignService;

    @Test
    void contextLoads() {
    }

    @Test
    void openFeignTest(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setNickname("张三");
        R res = couponFeignService.memberCoupon();
        System.out.println(res);

    }

}
