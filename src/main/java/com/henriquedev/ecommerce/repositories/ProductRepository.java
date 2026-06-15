package com.henriquedev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
