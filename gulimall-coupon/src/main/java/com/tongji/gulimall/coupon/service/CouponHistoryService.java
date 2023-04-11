package com.tongji.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tongji.common.utils.PageUtils;
import com.tongji.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-24 08:07:40
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

