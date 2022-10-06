package com.ms.instagram.user;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toProfile(UserDTO userDTO);
    UserDTO toProfileDTO(User profile);
    List<UserDTO> toProfileDTOs(List<User> profiles);
    List<User> toProfile(List<UserDTO> userDTOS);
}
