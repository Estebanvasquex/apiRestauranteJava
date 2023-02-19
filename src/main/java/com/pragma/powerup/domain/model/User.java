package com.pragma.powerup.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
public class User {
    private Long id;
    private Long register;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String password;




    public User(long id, Long register, String name, String lastName, String phone, String email, String password) {
        // TODO: esto lo estaremos usando para hacer las validaciones por constructor
        //if(name.isEmpty()){
        //    throw new DomainException("Debes ingresar un nombre");
        //}
        this.id = id;
        this.register = register;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.password = password;
    }
}
