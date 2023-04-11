package com.tongji.gulimall.member.dao;

import com.tongji.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author WangZhuoyuan
 * @email 923003354@qq.com
 * @date 2023-03-24 08:18:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
