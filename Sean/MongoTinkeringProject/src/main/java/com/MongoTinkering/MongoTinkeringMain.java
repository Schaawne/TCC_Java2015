package com.MongoTinkering;


import com.Aeromet.DBInterface;

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
    private DBInterface theDBInterface;

    /**
     * Default Constructor for MongoTinkeringMain
     */
    public MongoTinkeringMain(DBInterface theDBInterface) {
        this.theDBInterface = theDBInterface;
    }

    public static void main(String[] args)
    {
        System.out.println("-----com.MongoTinkering.MongoTinkeringMain MongoTinkeringMain() method start!-----");

        System.out.println("-----com.MongoTinkering.MongoTinkeringMain MongoTinkeringMain() method end!-----");
    }
}
