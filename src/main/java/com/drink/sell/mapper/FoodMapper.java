package com.drink.sell.mapper;

import com.drink.sell.bean.Food;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodMapper {
    int deleteByPrimaryKey(String id);

    int insert(Food record);

    int insertSelective(Food record);

    Food selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Food record);

    int updateByPrimaryKey(Food record);
}