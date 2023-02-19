package com.pragma.powerup.application.handler.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequestDto {
    private long id;
    private Long register;
    private String name;
    private String lasName;
    private String phone;
    private String email;
    private String password;
}
