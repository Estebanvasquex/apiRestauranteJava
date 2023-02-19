package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.handler.IUserHandler;
import com.pragma.powerup.application.handler.dto.request.UserRequestDto;
import com.pragma.powerup.application.handler.dto.response.UserResponseDto;
import com.pragma.powerup.application.mapper.IUserRequestMapper;
import com.pragma.powerup.application.mapper.IUserResponseMapper;
import com.pragma.powerup.domain.api.IUserServicePort;
import com.pragma.powerup.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Genera constructor para todos los atributos que esten definidos como finales
@RequiredArgsConstructor
@Service //toma la case como un bean spring
@Transactional//las peticiones deben ser atomicas en caso de falla a mitad de camino debe tener la capacidad de volver al estado anterior
public class UserHandler implements IUserHandler {

    //Pasa de aplicación a dominio y va a utilizar a cualquera que los implemente


    private final IUserServicePort userServicePort;

    private final IUserResponseMapper userResponseMapper;

    private final IUserRequestMapper iUserRequestMapper;

    @Override
    public void saveUser(UserRequestDto userRequestDto) {
        User user = iUserRequestMapper.toUser(userRequestDto);
        userServicePort.saveUser(user);
    }

    @Override
    public List<UserResponseDto> getAllUser() {
        return userResponseMapper.toResponseList(userServicePort.getAllUser());
    }
}
