package com.tongji.gulimall.order.dao;

import com.tongji.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-24 10:29:53
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
