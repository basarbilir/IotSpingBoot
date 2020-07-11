package com.iotexam.Repositories;

import com.iotexam.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserMongoRepository extends MongoRepository<User, String> {
                List<User> findByDescription(String description);
        }
