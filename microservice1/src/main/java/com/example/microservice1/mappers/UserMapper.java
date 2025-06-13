package com.example.microservice1.mappers;

import com.example.microservice1.dtos.UserDTO;
import com.example.microservice1.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")  //componentModel = "spring" ==> must be exist or it will cause an error
public interface UserMapper {
    UserDTO userToUserDTO(User user);
}
