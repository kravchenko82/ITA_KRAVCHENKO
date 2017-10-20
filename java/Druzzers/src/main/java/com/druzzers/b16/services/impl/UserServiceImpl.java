package com.druzzers.b16.services.impl;

import com.druzzers.b16.entities.User;
import com.druzzers.b16.reposiories.UserRepository;
import com.druzzers.b16.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUsers() {
       List<User> users = userRepository.findAll();
                return users;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);

    }
}
