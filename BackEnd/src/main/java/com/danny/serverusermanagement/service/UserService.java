package com.danny.serverusermanagement.service;

import com.danny.serverusermanagement.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    User findByUsername(String username);

    List<User> findAllUsers();
}
