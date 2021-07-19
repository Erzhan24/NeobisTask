package com.example.demo4.service;

import com.example.demo4.entity.User;
import com.example.demo4.model.UserRegistrationDataTransferObject;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDataTransferObject userRegistrationDataTransferObject);

}
