package com.druzzers.b16.entities;

import lombok.Data;

import java.util.List;

@Data
public class Comment {

    private String id;
    private String userId;
    private String dateOfPublication;
    private String text;
    private List<String> images;
}