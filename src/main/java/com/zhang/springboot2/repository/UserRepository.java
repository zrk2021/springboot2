package com.zhang.springboot2.repository;

import com.zhang.springboot2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
