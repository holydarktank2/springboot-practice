package com.yulun.springboot_practice.dao;

import com.yulun.springboot_practice.dto.UserRegisterRequest;
import com.yulun.springboot_practice.model.User;

public interface UserDao {
    User getUserById(Integer userId);
    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);

}
