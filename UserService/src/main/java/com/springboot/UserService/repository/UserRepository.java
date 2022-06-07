package com.springboot.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.UserService.model.User;


public interface UserRepository extends JpaRepository<User, Integer>{

}