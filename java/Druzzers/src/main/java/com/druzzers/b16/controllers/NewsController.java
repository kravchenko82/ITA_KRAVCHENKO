package com.druzzers.b16.controllers;

import com.druzzers.b16.entities.News;
import com.druzzers.b16.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    @Qualifier("mockNewsServiceImpl")
    private NewsService newsService;

    @GetMapping(path = "/news")
    public List<News> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/news/{topic}")
    public News getNews(@PathVariable String topic) {
        News news = new News();
        news.setTopic(topic);
        return news;
    }

    @PostMapping("news/")
    public News setNews(@RequestBody News news) {
        return news;
    }

}

