package com.HelloWorld;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Schaawne on 8/7/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 */
public class TestClassTest {
    /**
     * Test for TestClass constructor
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Default Constructor</li>
     *     </ul>
     *
     * @throws Exception passes exceptions to caller
     */
    public void testTestClass() throws Exception {
        /**
         * Default Constructor check
         *
         * Passes if:
         * -PubInt is initialized to 0
         * -privInt is initialized to 0
         */
        TestClass tester = new TestClass();
        assertEquals("PubInt must be initialized to 0!", 0, tester.PubInt);
        assertEquals("privInt must be initialized to 0!", 0, tester.getPrivInt());
    }
    /**
     * Test for PubInt public access
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Default Constructor</li>
     *         <li>Modify PubInt</li>
     *     </ul>
     *
     * @throws Exception exceptions passed to caller
     */
    @Test
    public void testPubInt() throws Exception {
        /**
         * Default Constructor check
         *
         * Passes if:
         * -PubInt is initialized to 0
         */
        TestClass tester = new TestClass(); //Instantiate new TestClass object
        assertEquals("TestClass constructor must set PubInt to 0!", 0, tester.PubInt);

        /**
         * Modify PubInt check
         *
         * Passes if:
         * -PubInt is changed to 5
         */
        tester.PubInt = 5;
        assertEquals("TestClass.PubInt must now be 5!", 5, tester.PubInt);
    }

    /**
     * Test for privInt accessors
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Default Constructor</li>
     *         <li>Modify privInt</li>
     *     </ul>
     *
     * @throws Exception exceptions passed to caller
     */
    @Test
    public void testPrivIntAccessors() throws Exception {
        /**
         * Default Constructor check
         *
         * Passes if:
         * -privInt is initialized to 0
         */
        TestClass tester = new TestClass(); //Instantiate new TestClass object
        assertEquals("TestClass constructor must set privInt to 0!", 0, tester.getPrivInt());

        /**
         * Modify privInt check
         *
         * Passes if:
         * -privInt is changed to 3
         */
        tester.setPrivInt(3);
        assertEquals("Tester.privInt must now be 3!", 3, tester.getPrivInt());
    }
}