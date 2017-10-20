package com.druzzers.b16.controllers;

import com.druzzers.b16.entities.User;
import com.druzzers.b16.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    @Qualifier("mockUserServiceImpl")
    private UserService userService;

    @GetMapping("/")
    public String rootUser() {
        return "";
    }

    @GetMapping(path = "/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    @PostMapping("/{id}/{email}/{password}/newUser")
    public User setUser(@PathVariable long id,
                        @PathVariable String email,
                        @PathVariable String password) {
        return new User();
    }


    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return null;
    }

    @PostMapping("/")
    public User setUser(@RequestBody @Valid User user) {
        //todo check rejecting dy annotation @Indexes
        userService.save(user);
        return user;
    }
}
