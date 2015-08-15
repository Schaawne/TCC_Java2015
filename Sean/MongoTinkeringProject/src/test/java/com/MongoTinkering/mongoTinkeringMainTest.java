package com.MongoTinkering;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * mongoTinkeringMainTest class for MongoTinkeringProject
 * <p>
 * Created by Schaawne on 8/10/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 * @since 0.0.0.1
 */
public class mongoTinkeringMainTest {
    /**
     * Test for com.MongoTinkering.MongoTinkeringMain constructor
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Default constructor</li>
     *     </ul>
     *
     * @throws Exception passes exceptions to caller
     */
    @Test
    public void testMainConstructor() throws Exception {
        /**
         * Default constructor check
         *
         * Passes if:
         * -No exceptions thrown
         */
        MongoTinkeringMain theMainClass = new MongoTinkeringMain();
    }
}