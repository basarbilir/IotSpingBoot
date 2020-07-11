package com.iotexam.Repositories;

import com.iotexam.domain.VariableCluster;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VariableClusterMongoRepository extends MongoRepository<VariableCluster, String> {
        }
