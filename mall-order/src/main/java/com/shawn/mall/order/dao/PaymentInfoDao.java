package com.shawn.mall.order.dao;

import com.shawn.mall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-27 00:09:23
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
