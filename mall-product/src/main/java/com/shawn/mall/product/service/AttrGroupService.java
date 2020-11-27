package com.shawn.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shawn.common.utils.PageUtils;
import com.shawn.mall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author shawn
 * @email shawnzhangwork123@gmail.com
 * @date 2020-11-26 20:38:32
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

