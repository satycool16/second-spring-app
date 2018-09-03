package com.sagar.secondspringapp.service;

import com.sagar.secondspringapp.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(Integer userId);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
