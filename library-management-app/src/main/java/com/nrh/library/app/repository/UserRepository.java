package com.nrh.library.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nrh.library.app.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
