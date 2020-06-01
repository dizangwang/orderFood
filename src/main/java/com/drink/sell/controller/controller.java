package com.drink.sell.controller;

import com.drink.sell.bean.ProductCategory;
import com.drink.sell.mapper.ProductCategoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buyer/product")
public class controller {
    private final Logger logger= LoggerFactory.getLogger(controller.class);
    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @GetMapping("/hello")
    public String hello() {
        String name="liu";
        String age="6";
        logger.debug("debug");
        logger.info("info{}{}",name,age);
        logger.error("error");
        ProductCategory pro = productCategoryMapper.selectByCategoryType(1);
        return pro.toString();
    }

}
