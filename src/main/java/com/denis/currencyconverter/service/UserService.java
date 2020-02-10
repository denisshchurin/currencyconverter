package com.denis.currencyconverter.service;

import com.denis.currencyconverter.model.History;
import com.denis.currencyconverter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

       // some methods

}
