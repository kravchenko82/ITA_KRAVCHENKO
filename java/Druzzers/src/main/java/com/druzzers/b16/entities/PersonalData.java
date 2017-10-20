package com.druzzers.b16.entities;

import lombok.Data;

import java.util.Date;

@Data
public class PersonalData {
    private long userId;

    private String name;
    private String surname;
    private String gender;
    private Date dateOfBirth;
    private String country;
    private String city;
    private long phone;
}