package com.tongji.gulimall.order.dao;

import com.tongji.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-24 10:29:53
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
