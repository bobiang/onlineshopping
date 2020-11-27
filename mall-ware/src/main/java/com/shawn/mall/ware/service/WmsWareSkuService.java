package com.shawn.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawn.common.utils.PageUtils;
import com.shawn.mall.ware.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-27 00:15:42
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

