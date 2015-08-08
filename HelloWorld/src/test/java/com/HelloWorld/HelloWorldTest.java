package com.HelloWorld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Schaawne on 8/7/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 */
public class HelloWorldTest {
    /**
     * Test for HelloWorld constructor
     *
     * @throws Exception passes exceptions to caller
     */
    @Test
    public void testHelloWorld() throws Exception {
        /**
         * Constructor check
         * <p>
         *     -Passes if:
         *     <ul>
         *         <li>No exceptions thrown</li>
         *     </ul>
         * </p>
         */
        HelloWorld tester = new HelloWorld();
    }

    /**
     * Test for Main() function
     *
     * @throws Exception passes exceptions to caller
     */
    @Test
    public void testMain() throws Exception {
        /**
         * Constructor check
         * <p>
         *     -Passes if no exceptions thrown
         * </p>
         */
        HelloWorld tester = new HelloWorld();
        HelloWorld.main(null);
    }
}