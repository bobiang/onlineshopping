package com.shawn.mall.product.dao;

import com.shawn.mall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-26 20:38:32
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
