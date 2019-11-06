package com.daily.needs.service;

import com.daily.needs.entity.Cart;
import com.daily.needs.entity.ProductInOrder;
import com.daily.needs.entity.User;

import java.util.Collection;

/**
 * Created By Ajay Shetty on 3/10/2018.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
