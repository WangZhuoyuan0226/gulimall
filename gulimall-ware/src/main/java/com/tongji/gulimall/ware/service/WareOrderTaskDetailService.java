package com.tongji.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tongji.common.utils.PageUtils;
import com.tongji.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-24 10:40:25
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

