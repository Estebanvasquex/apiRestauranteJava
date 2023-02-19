package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.User;

import java.util.List;

public interface IUserServicePort {
    void saveUser(User user);

    List<User> getAllUser();
}
