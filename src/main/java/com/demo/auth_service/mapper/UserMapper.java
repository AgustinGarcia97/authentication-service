package com.demo.auth_service.mapper;

import com.demo.auth_service.dto.UserResponse;
import com.demo.auth_service.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toResponse(User user);
}