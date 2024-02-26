package com.reliantvision.InsuranceManagementSystem.service.impl;

import com.reliantvision.InsuranceManagementSystem.payload.UserDto;
import com.reliantvision.InsuranceManagementSystem.repository.UserRepository;
import com.reliantvision.InsuranceManagementSystem.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import com.reliantvision.InsuranceManagementSystem.entity.User;
import java.util.List;

public class UserServiceImpl implements UserService {
@Autowired
private UserRepository userRepository;
 @Autowired
private ModelMapper modelMapper;
    @Override
    public UserDto createUser(UserDto userdto) {
        User user=new User();
        user.setFirstName("Shiva");

        return null;
    }

    @Override
    public UserDto findUserById(Long id) {
        return null;
    }

    @Override
    public List<UserDto> findAllUsers() {
        return null;
    }

    @Override
    public UserDto updateUser(UserDto userdto) {
        return null;
    }

    @Override
    public String deleteUser(UserDto userdto) {
        return "Delete";
    }
}
