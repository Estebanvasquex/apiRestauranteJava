package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.handler.dto.request.UserRequestDto;
import com.pragma.powerup.application.handler.dto.response.UserResponseDto;
import com.pragma.powerup.domain.model.User;

import java.util.List;

public interface IUserHandler {

    void saveUser(UserRequestDto userRequestDto);

    List<UserResponseDto> getAllUser();
}
