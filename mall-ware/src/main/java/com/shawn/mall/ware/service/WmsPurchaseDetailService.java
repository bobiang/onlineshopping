package com.shawn.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawn.common.utils.PageUtils;
import com.shawn.mall.ware.entity.WmsPurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-27 00:15:42
 */
public interface WmsPurchaseDetailService extends IService<WmsPurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

