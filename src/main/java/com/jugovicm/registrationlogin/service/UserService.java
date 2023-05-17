package com.jugovicm.registrationlogin.service;

import com.jugovicm.registrationlogin.model.User;
import com.jugovicm.registrationlogin.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
