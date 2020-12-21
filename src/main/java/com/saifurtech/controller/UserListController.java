package com.saifurtech.controller;

import com.saifurtech.domain.entity.UserEntity;
import com.saifurtech.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserListController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/list/get", method = RequestMethod.GET)
    public Iterable<UserEntity> getUserList() {
        return userRepository.findAll();
    }
}
