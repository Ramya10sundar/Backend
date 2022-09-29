package com.flight.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight.project.dto.User;

public interface UserRepository  extends JpaRepository<User, Long>{
}

