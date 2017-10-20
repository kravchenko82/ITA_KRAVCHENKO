package com.druzzers.b16.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainPageController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}