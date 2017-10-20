package com.druzzers.b16.entities;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class TrackingData {

    private List<Login> loginData;
    private boolean isOnline;

    private class Login {
        private String ip;
        private Date loginTime;
        private String country;
        private String browser;
    }
}