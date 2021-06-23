package com.systempro.CursoJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systempro.CursoJpa.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
