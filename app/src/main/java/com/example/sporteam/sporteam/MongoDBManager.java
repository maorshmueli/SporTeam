package com.example.sporteam.sporteam;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

import java.util.List;
import java.util.Set;

public class MongoDBManager {
    private static MongoClient client;


    public MongoDBManager(MongoClientURI connectionString){
        connect(connectionString);
    }

    private void connect(MongoClientURI connectionString){
        try{
            this.client = new MongoClient(connectionString);
        }
        catch (Exception e)
        {
            System.out.println("Failed to connect to MongoDB");
        }
    }


    public MongoDatabase getDB(String DBName){
        return this.client.getDatabase(DBName);

    }
}