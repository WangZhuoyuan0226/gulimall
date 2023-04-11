package com.tongji.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tongji.common.utils.PageUtils;
import com.tongji.gulimall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-24 10:40:25
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

