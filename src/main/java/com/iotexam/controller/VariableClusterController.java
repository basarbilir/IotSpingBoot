package com.iotexam.controller;

import com.iotexam.Repositories.VariableClusterMongoRepository;
import com.iotexam.domain.VariableCluster;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Data
@RequestMapping("/variables")
@AllArgsConstructor
public class VariableClusterController {

    @Autowired
    private VariableClusterMongoRepository variableClusterMongoRepository;

    //MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

    //MongoDatabase database = mongoClient.getDatabase("iot");

    //MongoCollection<Document> collection = database.getCollection("variables");


    //@GetMapping("/signup")
    //public List<User> showSignUpForm(User user) {
    //    return userMongoRepository.findAll();
    //}

    @GetMapping
    public ResponseEntity<List<VariableCluster>> getAllStudents() {
        //Optional<VariableCluster> all = variableClusterMongoRepository.findById("5f024b3f749780487c1e1d71");
        List<VariableCluster> all = variableClusterMongoRepository.findAll();

        return ResponseEntity.ok(all);
    }

    @GetMapping("/signup")
    public String showSignUpForm(VariableCluster variableCluster) {
        return "test";
    }

    @GetMapping("/signup2")
    public List <Document> getAllEmployees() {
        VariableCluster variableClusterTest = new VariableCluster();
        variableClusterTest.setId("testId");
        VariableCluster variableClusterTest2 = new VariableCluster();
        variableClusterTest.setId("testId2");
        ArrayList<VariableCluster> list = new ArrayList<>();
        list.add(variableClusterTest);
        list.add(variableClusterTest2);
        variableClusterMongoRepository.save(variableClusterTest);
        List results = new ArrayList<>();
        //collection.find(new Document()).limit(100).into(results);
        return results;
    }

}
