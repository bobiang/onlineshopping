package com.shawn.mall.coupon.dao;

import com.shawn.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-26 21:27:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
