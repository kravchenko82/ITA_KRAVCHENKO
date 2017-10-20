package com.druzzers.b16.services.impl;

import com.druzzers.b16.entities.User;
import com.druzzers.b16.reposiories.UserRepository;
import com.druzzers.b16.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class MockUserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @PostConstruct
    public void prepareData() {
        userRepository.save(new User("1", "1L@gmail.com", "asdf"));
        userRepository.save(new User("2", "2A@gmail.com", "rgdb"));
        userRepository.save(new User("3", "3D@gmail.com", "qwer"));
    }

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
