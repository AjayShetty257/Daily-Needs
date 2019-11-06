package com.daily.needs.repository;

import com.daily.needs.entity.ProductInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Ajay Shetty on 3/14/2018.
 */
public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
