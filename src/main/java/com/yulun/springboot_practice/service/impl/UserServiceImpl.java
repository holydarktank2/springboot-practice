package com.yulun.springboot_practice.service.impl;

import com.yulun.springboot_practice.dao.UserDao;
import com.yulun.springboot_practice.dto.UserRegisterRequest;
import com.yulun.springboot_practice.model.User;
import com.yulun.springboot_practice.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Autowired
    private UserDao userDao;


    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        //檢查註冊 email
        User user = userDao.getUserByEmail(userRegisterRequest.getEmail());
        if(user != null){
            logger.warn("該 email {} 已經被註冊", userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //創建帳號
        return userDao.createUser(userRegisterRequest);
    }
}
