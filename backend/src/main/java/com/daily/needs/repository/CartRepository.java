package com.daily.needs.repository;

import com.daily.needs.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By Ajay Shetty on 1/2/2019.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
