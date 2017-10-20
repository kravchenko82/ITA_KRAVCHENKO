package com.druzzers.b16.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class News {

    private String id;
    private String topic;
    private String userId;
    private String dateOfPublication;
    private boolean isAnonymous;
    private List<String> tags;
    private String text;
    private List<String> images;
    private List<Comment> comments;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy/MM/dd")
    private Date publishedAt;

    public News(String topic, String text, Date publishedAt) {

        this.topic = topic;
        this.text = text;
        this.publishedAt = publishedAt;
    }

    public News() {}
}
