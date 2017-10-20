package com.druzzers.b16.services;


import com.druzzers.b16.entities.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void save(User user);
}
