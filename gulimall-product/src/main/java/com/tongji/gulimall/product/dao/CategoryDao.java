package com.tongji.gulimall.product.dao;

import com.tongji.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-23 13:18:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
