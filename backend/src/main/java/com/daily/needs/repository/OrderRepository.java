package com.daily.needs.repository;


import com.daily.needs.entity.OrderMain;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Ajay Shetty on 3/14/2018.
 */
public interface OrderRepository extends JpaRepository<OrderMain, Integer> {
    OrderMain findByOrderId(Long orderId);


    Page<OrderMain> findAllByOrderStatusOrderByCreateTimeDesc(Integer orderStatus, Pageable pageable);


    Page<OrderMain> findAllByBuyerEmailOrderByOrderStatusAscCreateTimeDesc(String buyerEmail, Pageable pageable);

    Page<OrderMain> findAllByOrderByOrderStatusAscCreateTimeDesc(Pageable pageable);

    Page<OrderMain> findAllByBuyerPhoneOrderByOrderStatusAscCreateTimeDesc(String buyerPhone, Pageable pageable);
}
