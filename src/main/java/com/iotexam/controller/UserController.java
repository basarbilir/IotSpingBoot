package com.iotexam.controller;

import com.iotexam.Repositories.UserMongoRepository;
import com.iotexam.domain.User;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserMongoRepository userMongoRepository;

    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");

    MongoDatabase database = mongoClient.getDatabase("iot");

    MongoCollection<Document> collection = database.getCollection("variable");

    Document myDoc = collection.find().first();


    //@GetMapping("/signup")
    //public List<User> showSignUpForm(User user) {
    //    return userMongoRepository.findAll();
    //}

    @GetMapping("/signup")
    public String showSignUpForm(User user) {
        return "test";
    }

    @GetMapping("/signup2")
    public List <Document> getAllEmployees() {
        User userTest = new User();
        userTest.setId("testId");
        User userTest2 = new User();
        userTest.setId("testId2");
        ArrayList<User> list = new ArrayList<>();
        list.add(userTest);
        list.add(userTest2);
        userMongoRepository.save(userTest);
        List results = new ArrayList<>();
        collection.find(new Document()).limit(100).into(results);
        List<User> testUser = userMongoRepository.findByDescription("testId");
        return results;
    }

}
