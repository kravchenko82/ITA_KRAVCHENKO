package com.druzzers.b16.entities;

import lombok.Data;

@Data
public class Friend {

    private User user;

    public Friend(User user) {
        this.user = user;
    }
}