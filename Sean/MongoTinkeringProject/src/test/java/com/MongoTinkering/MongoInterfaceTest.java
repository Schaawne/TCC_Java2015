package com.MongoTinkering;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * MongoInterfaceTest class for MongoTinkeringProject
 * <p>
 * Created by Schaawne on 8/11/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class MongoInterfaceTest {
    /**
     * Test for MongoInterface Constructor
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Default Constructor</li>
     *         <li>DB Location Constructor</li>
     *         <li>Full Constructor</li>
     *     </ul>
     * @throws Exception
     */
    @Test
    public void testMongoInterfaceConstructor() throws Exception {
        /**
         * Default Constructor check
         * Passes if:
         * -All variables are initialized to expected defaults
         */
        //Construct the interface using defaults
        MongoInterface theDefaultMongoInterface = new MongoInterface();

        //Check for default values
        assertEquals("dbPath must be default value \"localhost\"", "localhost", theDefaultMongoInterface.getDbPath());
        assertEquals("dbPort must be default value \"27017\"", 27017, theDefaultMongoInterface.getDbPort());
        assertEquals("dbName must be default value \"local\"", "local", theDefaultMongoInterface.getDbName());
        assertEquals("usersDBName must be default value \"users\"", "users", theDefaultMongoInterface.getUsersDBName());
        assertEquals("dbUsername must be default value \"default\"", "default", theDefaultMongoInterface.getDbUsername());
        assertEquals("dbPassword must be default value \"password\"", "password", theDefaultMongoInterface.getDbPassword());

        /**
         * DB Location Constructor check
         * Passes if:
         * -DB Location variables match provided values
         * -User Authentication variables match expected defaults
         */
        //Construct the interface using DB Location values
        MongoInterface theSecondMongoInterface = new MongoInterface("192.168.1.1", 27000, "testDB");

        //Check for passed in values
        assertEquals("dbPath must be passed value \"192.168.1.1\"", "192.168.1.1", theSecondMongoInterface.getDbPath());
        assertEquals("dbPort must be passed value \"27000\"", 27000, theSecondMongoInterface.getDbPort());
        assertEquals("dbName must be passed value \"testDB\"", "testDB", theSecondMongoInterface.getDbName());

        //Check for default values
        assertEquals("usersDBName must be default value \"users\"", "users", theSecondMongoInterface.getUsersDBName());
        assertEquals("dbUsername must be default value \"default\"", "default", theSecondMongoInterface.getDbUsername());
        assertEquals("dbPassword must be default value \"password\"", "password", theSecondMongoInterface.getDbPassword());

        /**
         * Full Constructor check
         * Passes if:
         * -All variables match provided values
         */
        //Construct the interface using defaults
        MongoInterface theThirdMongoInterface = new MongoInterface("192.168.1.2", 27001, "DBTest", "authDB", "newUser", "userPW");

        //Check for passed in values
        assertEquals("192.168.1.2", theThirdMongoInterface.getDbPath());
        assertEquals(27001, theThirdMongoInterface.getDbPort());
        assertEquals("dbName must be passed value \"DBTest\"", "DBTest", theThirdMongoInterface.getDbName());
        assertEquals("usersDBName must be passed value \"authDB\"", "authDB", theThirdMongoInterface.getUsersDBName());
        assertEquals("dbUsername must be passed value \"newUser\"", "newUser", theThirdMongoInterface.getDbUsername());
        assertEquals("dbPassword must be passed value \"userPW\"", "userPW", theThirdMongoInterface.getDbPassword());
    }

    /**
     * Test for Connect method
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Successful connect to localDB</li>
     *         <li>Failed connect to localDB</li>
     *     </ul>
     * @throws Exception
     */
    @Test
    public void testConnnect() throws Exception {
        /**
         * Successful connect to localDB
         * Passes if:
         * -Connect occurs successfully
         */
        MongoInterface theGoodInterface = new MongoInterface();
        assertTrue("Connect() call must return true!", theGoodInterface.Connnect());

        /**
         * Failed connect to localDB
         * Passes if:
         * -Connect fails with bad dbPath
         * -Connect fails with bad dbPort
         * -Connect fails with bad dbName
         * -Connect fails with bad usersDbName
         * -Connect fails with bad dbUserName
         * -Connect fails with bad dbPassword
         */
        MongoInterface badPathInterface = new MongoInterface("badPath", 27017, "local");
        assertFalse("Connect() call must return false for bad dbPath!", badPathInterface.Connnect());
    }
}