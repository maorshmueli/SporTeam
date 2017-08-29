package com.example.sporteam.sporteam;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

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


    public DB getDB(String DBName,String user,String password){
        DB db = this.client.getDB(DBName);
        if (db.authenticate(user, password.toCharArray())){
            return db;
        }
        else
        {
            System.out.println("Could not authenticate!");
        }
        return null;

    }
}