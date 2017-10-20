package com.druzzers.b16.controllers;

import com.druzzers.b16.entities.PersonalData;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/personaldata")

public class PersonalDataController {

    @GetMapping("/{id}")
    public PersonalData getPersonalData(@PathVariable long id) {
        PersonalData personalData = new PersonalData();
        personalData.setUserId(id);
        return personalData;
    }

    @PostMapping("/{id}/{name}/{surname}/{gender}/{dateOfBirth}/{country}/{city}/{phone}/edit")
    public PersonalData setPersonalData(@PathVariable long id,
                                        @PathVariable String name,
                                        @PathVariable String surname,
                                        @PathVariable String gender,
                                        @PathVariable Date dateOfBirth,
                                        @PathVariable String country,
                                        @PathVariable String city,
                                        @PathVariable long phone) {
        return new PersonalData();
    }
}