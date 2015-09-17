package com.DBApp;

import com.MongoTinkering.MongoInterface;
import com.MongoTinkering.MongoTinkeringMain;

/**
 * DBAppMain class for MongoTinkeringProject
 * <p>
 * Created by Schaawne on 8/27/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class DBAppMain {
    public static void main(String[] args)
    {
        System.out.println("-----Start DBAppMain.main()-----");
        MongoTinkeringMain theMongoTinkeringApp = new MongoTinkeringMain(new MongoInterface());
        System.out.println("-----End DBAppMain.main()-----");
    }
}
