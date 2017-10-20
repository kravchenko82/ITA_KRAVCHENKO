package com.druzzers.b16.services.impl;

import com.druzzers.b16.entities.News;
import com.druzzers.b16.services.NewsService;
import org.springframework.stereotype.Service;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Override
    public List<News> getAllNews() {
        throw new NotImplementedException();
    }
}
