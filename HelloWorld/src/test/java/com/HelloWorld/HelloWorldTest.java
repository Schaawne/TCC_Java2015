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
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Default Constructor</li>
     *     </ul>
     *
     * @throws Exception passes exceptions to caller
     */
    @Test
    public void testHelloWorld() throws Exception {
        /**
         * Default Constructor check
         *
         * Passes if:
         * -No exceptions thrown
         */
        HelloWorld tester = new HelloWorld();
    }

    /**
     * Test for Main() function
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Empty args</li>
     *         <li>Non-empty args</li>
     *     </ul>
     *
     * @throws Exception passes exceptions to caller
     */
    @Test
    public void testMain() throws Exception {
        /**
         * Empty args check
         *
         * Passes if:
         * -No exceptions thrown
         */
        HelloWorld.main(null);

        /**
         * Args provided check
         *
         * Passes if:
         * -No exceptions thrown
         */
        String[] strings = {"Arg1", "Arg2"};
        HelloWorld.main(strings);
    }
}