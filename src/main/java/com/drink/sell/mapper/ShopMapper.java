package com.drink.sell.mapper;

import com.drink.sell.bean.Shop;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopMapper {
    int deleteByPrimaryKey(String id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}