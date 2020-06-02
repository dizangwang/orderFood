package com.drink.sell.mapper;

import com.drink.sell.bean.Buyer;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerMapper {
    int deleteByPrimaryKey(String id);

    int insert(Buyer record);

    int insertSelective(Buyer record);

    Buyer selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Buyer record);

    int updateByPrimaryKey(Buyer record);
}