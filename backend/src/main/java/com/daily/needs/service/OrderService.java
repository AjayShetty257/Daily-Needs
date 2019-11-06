package com.daily.needs.service;


import com.daily.needs.entity.OrderMain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created By Ajay Shetty on 3/14/2018.
 */

public interface OrderService {
    Page<OrderMain> findAll(Pageable pageable);

    Page<OrderMain> findByStatus(Integer status, Pageable pageable);

    Page<OrderMain> findByBuyerEmail(String email, Pageable pageable);

    Page<OrderMain> findByBuyerPhone(String phone, Pageable pageable);

    OrderMain findOne(Long orderId);


    OrderMain finish(Long orderId);

    OrderMain cancel(Long orderId);

}
