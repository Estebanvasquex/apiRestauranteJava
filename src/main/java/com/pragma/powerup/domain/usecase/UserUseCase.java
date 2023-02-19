package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IUserServicePort;
import com.pragma.powerup.domain.model.User;
import com.pragma.powerup.domain.spi.IUserPersistencePort;

import java.util.List;


public class UserUseCase implements IUserServicePort {


    private final IUserPersistencePort UserPersistencePort;

    //public UserUseCase(IUserServicePort userPersistencePort) {
     //   this.UserPersistencePort = userPersistencePort;
    //}


    public UserUseCase(IUserPersistencePort userPersistencePort) {
        UserPersistencePort = userPersistencePort;
    }

    @Override
    public void saveUser(User user) {
        UserPersistencePort.saveUser(user);
        //saveUser(user);

    }

    @Override
    public List<User> getAllUser() {
        return UserPersistencePort.getAllUsers();
    }

}
