package com.jugovicm.registrationlogin.service;

import com.jugovicm.registrationlogin.model.User;
import com.jugovicm.registrationlogin.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
