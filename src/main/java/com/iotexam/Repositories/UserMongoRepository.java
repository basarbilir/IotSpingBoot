package com.iotexam.Repositories;

import com.iotexam.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserMongoRepository extends MongoRepository<User, Integer> {

        }
