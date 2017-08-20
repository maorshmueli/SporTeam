package com.example.sporteam.sporteam;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class Common {
    private static String DB_NAME="sports";
    private static String COLLECTION_NAME="users";
    private static String API_KEY="A7IxrXZroLz8wj1pj7GkjhyJlELfEbve";


    public static void connect(User username){
        try {
            MongoClient client = new MongoClient("ds153003.mlab.com",53003);
            DB db = client.getDB("sport");


        }
        catch(Exception e)
        {
            System.out.println("Failed to connect to MongoDB");
        }
    }
}
