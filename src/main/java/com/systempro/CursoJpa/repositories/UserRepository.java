package com.systempro.CursoJpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systempro.CursoJpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
