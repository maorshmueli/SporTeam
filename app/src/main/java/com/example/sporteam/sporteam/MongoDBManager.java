package com.example.sporteam.sporteam;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import java.util.List;
import java.util.Set;

public class MongoDBManager {
    private static MongoClient client;


    public MongoDBManager(String host,int port){
        connect(host,port);
    }

    private void connect(String host,int port){
        try{
            this.client = new MongoClient(host,port);
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