package com.shawn.mall.product;

import com.shawn.mall.product.entity.BrandEntity;
import com.shawn.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.runner.RunWith;
@RunWith(SpringRunner.class)
@SpringBootTest
class MallProductApplicationTests {

	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity= new BrandEntity();
		brandEntity.setName("apple");
		brandService.save(brandEntity);
		System.out.println("success");
	}

}
