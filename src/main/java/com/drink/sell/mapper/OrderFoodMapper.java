package com.drink.sell.mapper;

import com.drink.sell.bean.OrderFood;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderFoodMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderFood record);

    int insertSelective(OrderFood record);

    OrderFood selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderFood record);

    int updateByPrimaryKey(OrderFood record);
}