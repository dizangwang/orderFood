package com.drink.sell.mapper;

import com.drink.sell.bean.FoodType;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodTypeMapper {
    int deleteByPrimaryKey(String id);

    int insert(FoodType record);

    int insertSelective(FoodType record);

    FoodType selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(FoodType record);

    int updateByPrimaryKey(FoodType record);
}