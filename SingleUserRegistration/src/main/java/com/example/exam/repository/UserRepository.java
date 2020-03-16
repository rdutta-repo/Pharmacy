package com.example.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exam.model.UserBean;

@Repository
public interface UserRepository extends JpaRepository<UserBean, Long>{

}
