package com.shawn.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawn.common.utils.PageUtils;
import com.shawn.mall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-27 00:09:23
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

