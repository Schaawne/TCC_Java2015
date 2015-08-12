package com.MongoTinkering;

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



    /**
     * Default Constructor for MongoInterface
     * <p>
     * Applies defaults for DB connection and configuration settings
     */
    public MongoInterface() {

    }
}
