package com.systempro.CursoJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systempro.CursoJpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
