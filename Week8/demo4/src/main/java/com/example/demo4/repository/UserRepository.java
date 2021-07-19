package com.example.demo4.repository;

import com.example.demo4.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    User findByEmail(String email);
}
