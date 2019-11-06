package com.daily.needs.service;

import com.daily.needs.entity.ProductCategory;

import java.util.List;

/**
 * Created By Ajay Shetty on 3/10/2018.
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
