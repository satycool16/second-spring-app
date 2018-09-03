package com.sagar.secondspringapp.converter;

import com.sagar.secondspringapp.dto.UserDto;
import com.sagar.secondspringapp.entity.User;

import java.util.stream.Collectors;

public class UserConverter {

    public static User dtoToEntity(UserDto userDto){
        User user=new User(userDto.getUserName(),null);
        user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
        return user;
    }

    public static UserDto entityToDto(User user){
        UserDto userDto=new UserDto(user.getUserId(),user.getUserName(),null);
        userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
        return userDto;
    }
}
