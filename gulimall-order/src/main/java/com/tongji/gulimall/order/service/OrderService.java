package com.tongji.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tongji.common.utils.PageUtils;
import com.tongji.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-24 10:29:53
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

