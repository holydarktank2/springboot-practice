package com.yulun.springboot_practice.dao;

import com.yulun.springboot_practice.dto.UserRegisterRequest;
import com.yulun.springboot_practice.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);
    User getUserById(Integer userId);
}
