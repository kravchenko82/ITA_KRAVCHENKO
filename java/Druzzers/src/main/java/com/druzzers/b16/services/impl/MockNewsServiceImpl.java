package com.druzzers.b16.services.impl;

import com.druzzers.b16.entities.News;
import com.druzzers.b16.reposiories.NewsRepository;
import com.druzzers.b16.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.swing.border.TitledBorder;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class MockNewsServiceImpl implements NewsService {


    @Autowired
    private NewsRepository newsRepository;

    @PostConstruct
    public void prepareData() {
        newsRepository.save(new News("Title 1", "Text1", new Date()));
        newsRepository.save(new News("Title 2", "Text2", new Date()));
        newsRepository.save(new News("Title 3", "Text3", new Date()));
    }

    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }
}
