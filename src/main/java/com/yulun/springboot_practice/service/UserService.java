package com.yulun.springboot_practice.service;

import com.yulun.springboot_practice.dto.UserRegisterRequest;
import com.yulun.springboot_practice.model.User;

public interface UserService {

    Integer register(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
}
