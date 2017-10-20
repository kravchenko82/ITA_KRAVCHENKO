package com.druzzers.b16.reposiories;

import com.druzzers.b16.entities.News;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

    public interface NewsRepository extends MongoRepository<News, String> {
        List<News> findAllByTopic(String topic);
    }

