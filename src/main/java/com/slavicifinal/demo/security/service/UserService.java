package com.slavicifinal.demo.security.service;


import com.slavicifinal.demo.security.model.User;
import com.slavicifinal.demo.security.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    User findByEmail(String email);

    User save(UserRegistrationDto registration);
}