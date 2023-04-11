package com.tongji.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tongji.common.utils.PageUtils;
import com.tongji.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-23 13:18:23
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

