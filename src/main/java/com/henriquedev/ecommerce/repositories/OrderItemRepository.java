package com.henriquedev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.ecommerce.entities.OrderItem;
import com.henriquedev.ecommerce.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
