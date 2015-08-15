package com.MongoTinkering;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * MongoInterface class for MongoTinkeringProject
 * <p>
 * Created by Schaawne on 8/10/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class MongoInterface {
    /** Database network location address */
    private String dbPath;

    /** Database port number */
    private int dbPort;

    /** Database name */
    private String dbName;

    /** UsersDB name */
    private String usersDBName;

    /** Database username */
    private String dbUsername;

    /** Database password */
    private String dbPassword;

    /** MongoDB server list */
    private List<ServerAddress> mongoDBSevers;

    /** MongoDB credentials list */
    private List<MongoCredential> mongoDBCredentials;

    /** MongoDB client object */
    private MongoClient mongoClient;

    /** MongoDB DB object */
    private MongoDatabase mongoDBObject;

    /**
     * Default Constructor for MongoInterface
     * <p>
     * Applies defaults for DB connection and configuration settings
     */
    public MongoInterface() {
        //Apply system defaults
        dbPath = "localhost";
        dbPort = 27017;
        dbName = "local";
        usersDBName = "users";
        dbUsername = "default";
        dbPassword = "password";

        //Set MongoDB resources to null
        mongoClient = null;
        mongoDBObject = null;
        mongoDBSevers = null;
        mongoDBCredentials = null;
    }

    /**
     * DB Location Constructor for MongoInterface
     * <p>
     * Calling function supplied database path, port, and name
     * Defaults applied for user authentication
     *
     * @param dbPath Path to the DB
     * @param dbPort Port for the DB
     * @param dbName Name of the DB located at the path and port
     */
    public MongoInterface(String dbPath, int dbPort, String dbName) {
        //Apply user-provided values
        this.dbPath = dbPath;
        this.dbPort = dbPort;
        this.dbName = dbName;

        //Apply system defaults
        usersDBName = "users";
        dbUsername = "default";
        dbPassword = "password";

        //Set MongoDB resources to null
        mongoClient = null;
        mongoDBObject = null;
        mongoDBSevers = null;
        mongoDBCredentials = null;
    }

    /**
     * Full Constructor for MongoInterface
     * <p>
     * Calling function supplied all configuration values for DB
     *
     * @param dbPath Path to the DB
     * @param dbPort Port for the DB
     * @param dbName Name of the DB located at the path and port
     * @param usersDBName Name of the user authentication DB
     * @param dbUsername Username to connect
     * @param dbPassword Password to connect
     */
    public MongoInterface(String dbPath, int dbPort, String dbName, String usersDBName, String dbUsername, String dbPassword) {
        //Apply user-provided defaults
        this.dbPath = dbPath;
        this.dbPort = dbPort;
        this.dbName = dbName;
        this.usersDBName = usersDBName;
        this.dbUsername = dbUsername;
        this.dbPassword = dbPassword;

        //Set MongoDB resources to null
        mongoClient = null;
        mongoDBObject = null;
        mongoDBSevers = null;
        mongoDBCredentials = null;
    }

    /**
     * Getter for dbPath
     *
     * @return dbPath String
     */
    public String getDbPath() {
        return dbPath;
    }

    /**
     * Getter for dbPort
     *
     * @return dbPort int
     */
    public int getDbPort() {
        return dbPort;
    }

    /**
     * getter for dbName
     *
     * @return dbName String
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Getter for usersDBName
     *
     * @return usersDBName String
     */
    public String getUsersDBName() {
        return usersDBName;
    }

    /**
     * Getter for dbUsername
     *
     * @return dbUsername String
     */
    public String getDbUsername() {
        return dbUsername;
    }

    /**
     * Getter for dbPassword
     *
     * @return dbPassword String
     */
    public String getDbPassword() {
        return dbPassword;
    }

    public boolean Connnect() {
        boolean returnVal = true; //Assume true, set false in failure blocks

        try{
            //Setup server list
            if(null == mongoDBSevers)
            {
                mongoDBSevers = new ArrayList<>();
                mongoDBSevers.add(new ServerAddress(dbPath));
            }
            else
            {
                returnVal = false;
                System.out.println("MongoDBServers already existed!");
            }
            //Setup credentials
            if(null == mongoDBCredentials)
            {
                mongoDBCredentials = new ArrayList<>();
                mongoDBCredentials.add(MongoCredential.createCredential(dbUsername, usersDBName, dbPassword.toCharArray()));
            }
            else
            {
                returnVal = false;
                System.out.println("MongoDBCredential already existed!");
            }

            //Create the client
            if(null == mongoClient) {
                mongoClient = new MongoClient(mongoDBSevers, mongoDBCredentials);
            }
            else
            {
                returnVal = false;
                System.out.println("MongoClient already existed!");
            }

            //Connect to the DB
            if(null == mongoDBObject) {
                mongoDBObject = mongoClient.getDatabase(dbName);
            }
            else
            {
                returnVal = false;
                System.out.println("MongoDBObject already existed!");
            }

            for(String collectionName : mongoDBObject.listCollectionNames())
            {
                System.out.println("Found collection " + collectionName);
            }
        } catch (Exception e) {
            returnVal = false;
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

        //Return boolean
        return returnVal;
    }
}