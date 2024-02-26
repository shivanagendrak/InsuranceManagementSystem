package com.reliantvision.InsuranceManagementSystem.service;

import com.reliantvision.InsuranceManagementSystem.entity.User;
import com.reliantvision.InsuranceManagementSystem.payload.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userdto);
    UserDto findUserById(Long id);
    List<UserDto> findAllUsers();

    UserDto updateUser(UserDto userdto);
    String deleteUser(UserDto userdto);



}
