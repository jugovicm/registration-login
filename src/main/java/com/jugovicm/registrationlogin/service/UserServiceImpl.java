package com.jugovicm.registrationlogin.service;

import com.jugovicm.registrationlogin.model.Role;
import com.jugovicm.registrationlogin.model.User;
import com.jugovicm.registrationlogin.repository.UserRepository;
import com.jugovicm.registrationlogin.web.dto.UserRegistrationDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User (registrationDto.getFirstName (), registrationDto.getLastName (),
                registrationDto.getEmail (), registrationDto.getPassword (),
                Arrays.asList (new Role ("ROLE USER") ));
        return userRepository.save ( user );
    }
}
