package com.MongoTinkering;


/**
 * Main class for MongoTinkering project
 * <p>
 * Created by Schaawne on 8/10/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class MongoTinkeringMain {
    /**
     * Default Constructor for MongoTinkeringMain
     */
    public MongoTinkeringMain() {
        System.out.println("-----com.MongoTinkering.MongoTinkeringMain Default Constructor start!-----");

        System.out.println("-----com.MongoTinkering.MongoTinkeringMain Default Constructor end!-----");
    }

    public static void main(String[] args)
    {
        System.out.println("-----com.MongoTinkering.MongoTinkeringMain MongoTinkeringMain() method start!-----");

        //Create MongoInterface object
        MongoInterface theMongoInterface = new MongoInterface();

        //Attempt to connect
        boolean connectSuccess = theMongoInterface.Connnect();
        System.out.println("Connection " + (connectSuccess ? "Succeeded!" : "Failed!"));

        //Get the collections list
        if(connectSuccess)
        {
            Iterable<String> collectionNames = theMongoInterface.getCollectionsList();
            boolean emptySet = true;
            for(String collectionName : collectionNames)
            {
                emptySet = false;
                System.out.println("Found collection name: \"" + collectionName + "\"");
            }
            if(emptySet)
            {
                System.out.println("No collections found!");
            }
        }

        System.out.println("-----com.MongoTinkering.MongoTinkeringMain MongoTinkeringMain() method end!-----");
    }
}
