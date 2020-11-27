package com.shawn.mall.order.dao;

import com.shawn.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-27 00:09:24
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
