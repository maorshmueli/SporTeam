package com.example.sporteam.sporteam;
import com.mongodb.DB;

import java.util.Set;

/**
 * Created by MarielC on 21/08/2017.
 */

public class DBConnection {
    private DB db;

    public DBConnection(MongoDBManager client,String dbname,String usr,String pw)
    {
        db=client.getDB(dbname,usr,pw);
    }

    public Set<String> getCollections()
    {
        return db.getCollectionNames();
    }
}