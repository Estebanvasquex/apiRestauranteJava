package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.User;
import com.pragma.powerup.infrastructure.out.jpa.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)

public interface IUserEntityMapper {

    UserEntity toEntity(User user); //permite pasar de User a UserEntity quando se rquiere hacer insert del dominio a una entidad

    User toUser(UserEntity userEntity); // permite pasar del la entidad de bd al usuairo

    List<User> toUserList(List<UserEntity> userEntityList);//Maper para traer lista de entidades a Users

}
