package com.Aeromet;

/**
 * DBInterface class for MongoTinkeringProject
 * <p>
 * Created by Schaawne on 8/27/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public abstract class DBInterface
{
    private String userName;
    private String pass;
    private String serverLocation;

    public abstract boolean Connect();
}