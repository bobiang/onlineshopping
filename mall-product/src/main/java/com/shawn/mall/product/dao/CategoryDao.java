package com.shawn.mall.product.dao;

import com.shawn.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-26 20:38:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
