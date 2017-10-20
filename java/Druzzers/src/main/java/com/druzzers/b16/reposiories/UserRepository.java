package com.druzzers.b16.reposiories;

import com.druzzers.b16.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByPassword(String password);
}
