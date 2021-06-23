package com.systempro.CursoJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systempro.CursoJpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
