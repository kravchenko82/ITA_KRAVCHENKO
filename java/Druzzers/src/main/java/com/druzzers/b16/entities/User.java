package com.druzzers.b16.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class User {
    @Id
    private String id;
    @Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$",
            message = "email is not valid")
    @Indexed(unique = true) // TODO unique doesn't works, figure out why
    private String email;
    @NotNull
    @Size(min = 3, max = 5)
    private String password;

    private PersonalData personalData;
    private List<News> newsList;
    private TrackingData trackingData;
    private List<Friend> friends;

    public User(String id, String email, String password) {

        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User() {
    }
}