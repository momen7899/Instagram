package com.ms.instagram.user;

import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserDTO userDTO);
    UserDTO toUserDTO(User profile);
    List<UserDTO> toUserDTOs(List<User> profiles);
    List<User> toUsers(List<UserDTO> userDTOS);
}
