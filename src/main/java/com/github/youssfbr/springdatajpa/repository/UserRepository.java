package com.github.youssfbr.springdatajpa.repository;

import com.github.youssfbr.springdatajpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
