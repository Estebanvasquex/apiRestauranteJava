package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.User;

import java.util.List;

public interface IUserPersistencePort {
    User saveUser(User user);

    List<User> getAllUsers();
}
