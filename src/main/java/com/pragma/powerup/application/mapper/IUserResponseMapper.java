package com.pragma.powerup.application.mapper;


import com.pragma.powerup.application.handler.dto.response.UserResponseDto;
import com.pragma.powerup.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserResponseMapper {
    User toResponse(User user);

    List<UserResponseDto> toResponseList(List<User> userList);
}
