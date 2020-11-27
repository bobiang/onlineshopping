package com.shawn.mall.product.dao;

import com.shawn.mall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-26 20:38:32
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
