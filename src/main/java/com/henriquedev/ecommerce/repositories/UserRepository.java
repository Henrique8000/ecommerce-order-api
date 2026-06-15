package com.henriquedev.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
