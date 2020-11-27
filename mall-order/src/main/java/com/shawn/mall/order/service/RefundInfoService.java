package com.shawn.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawn.common.utils.PageUtils;
import com.shawn.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-27 00:09:23
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

