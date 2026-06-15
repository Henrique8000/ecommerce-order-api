package com.henriquedev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
