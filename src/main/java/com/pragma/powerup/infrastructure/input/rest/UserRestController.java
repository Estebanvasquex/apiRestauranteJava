package com.pragma.powerup.infrastructure.input.rest;

import com.pragma.powerup.application.handler.IUserHandler;
import com.pragma.powerup.application.handler.dto.request.UserRequestDto;
import com.pragma.powerup.application.handler.dto.response.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserRestController {

    private final IUserHandler userHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveUser(@RequestBody UserRequestDto userRequestDto){
        userHandler.saveUser(userRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping("/")
    public ResponseEntity<List<UserResponseDto>> getAllUsers(){
        return ResponseEntity.ok(userHandler.getAllUser());
    }

}
