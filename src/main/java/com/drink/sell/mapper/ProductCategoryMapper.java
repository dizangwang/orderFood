package com.drink.sell.mapper;

import com.drink.sell.bean.ProductCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryMapper {
    ProductCategory selectByCategoryType(Integer category_type);
}
