package com.MongoTinkering;

import org.junit.Test;

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
     * Test for com.MongoTinkering.MongoTinkeringMain MongoTinkeringMain method
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Empty args</li>
     *         <li>Arge provided</li>
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
        MongoTinkeringMain.main(null);

        /**
         * Args provided check
         *
         * Passes if:
         * -No exceptions thrown
         */
        String[] mainArgs = {"Arg1", "Arg2"};
        MongoTinkeringMain.main(mainArgs);
    }

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