package com.batul.controller;

import com.batul.domain.entity.UserEntity;
import com.batul.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserListController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user/list/get", method = RequestMethod.POST)
    public Iterable<UserEntity> getUserList() {
        return userRepository.findAll();
    }
}
