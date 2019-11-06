package com.daily.needs.service;

import com.daily.needs.entity.ProductInOrder;
import com.daily.needs.entity.User;

/**
 * Created By Ajay Shetty on 1/3/2019.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
