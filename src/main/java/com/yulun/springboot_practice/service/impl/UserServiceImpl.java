package com.yulun.springboot_practice.service.impl;

import com.yulun.springboot_practice.dao.UserDao;
import com.yulun.springboot_practice.dto.UserRegisterRequest;
import com.yulun.springboot_practice.model.User;
import com.yulun.springboot_practice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
