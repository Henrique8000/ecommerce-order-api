package com.henriquedev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henriquedev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
