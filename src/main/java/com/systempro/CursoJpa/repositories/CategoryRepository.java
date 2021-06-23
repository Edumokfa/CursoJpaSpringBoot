package com.systempro.CursoJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systempro.CursoJpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
