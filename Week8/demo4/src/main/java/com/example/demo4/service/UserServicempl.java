package com.example.demo4.service;

import com.example.demo4.entity.User;
import com.example.demo4.model.UserRegistrationDataTransferObject;
import com.example.demo4.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.management.relation.Role;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class UserServicempl implements UserService{
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public void UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDataTransferObject userRegistrationDataTransferObject) {
        User user = new User(userRegistrationDataTransferObject.getName(),
                userRegistrationDataTransferObject.getLastName(), userRegistrationDataTransferObject.getEmail(),
                passwordEncoder.encode(userRegistrationDataTransferObject.getPassword()), Arrays.asList());

        return userRepository.save(user);
    }


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userRepository.findByEmail(email);
        if(user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.
                User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getRoleName())).collect(Collectors.toList());
    }
}

