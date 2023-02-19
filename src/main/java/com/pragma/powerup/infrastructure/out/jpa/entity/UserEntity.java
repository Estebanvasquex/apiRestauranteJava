package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor  //jpa requiere este constructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    @Column(name = "id_user", nullable = false)
    private Long id;
    private Long register;
    private String name;
    private String lastName;
    private String phone;
    private String email;
    private String password;

    //@ManyToOne
    //@JoinColumn(name = "id_rol")
    //private RolEntity rolEntity;

}
