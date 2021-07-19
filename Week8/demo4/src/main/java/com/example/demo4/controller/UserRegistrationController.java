package com.example.demo4.controller;

import com.example.demo4.entity.User;
import com.example.demo4.model.UserRegistrationDataTransferObject;
import com.example.demo4.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDataTransferObject userRegistrationDataTransferObject() {
        return new UserRegistrationDataTransferObject();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserRegistrationDataTransferObject userRegistrationDataTransferObject) {
        userService.save(userRegistrationDataTransferObject);
        return "redirect:/registration?success";
    }
}

