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
     *
     * @throws Exception passes exceptions to caller
     */
    public void testTestClass() throws Exception {
        /**
         * Constructor check
         * <p>
         *     -Passes if:
         *     <ul>
         *         <li>PubInt is initialized to 0.</li>
         *         <li>privInt is initialized to 0.</li>
         *     </ul>
         *
         * </p>
         */
        TestClass tester = new TestClass();
        assertEquals("PubInt must be initialized to 0!", 0, tester.PubInt);
        assertEquals("privInt must be initialized to 0!", 0, tester.getPrivInt());
    }
    /**
     * Test for PubInt public access
     *
     * @throws Exception exceptions passed to caller
     */
    @Test
    public void testPubInt() throws Exception {
        /**
         * Constructor check
         * <p>
         *     Passes if:
         *     <ul>
         *         <li>PubInt is initialized to 0.</li>
         *     </ul>
         * </p>
         */
        TestClass tester = new TestClass(); //Instantiate new TestClass object
        assertEquals("TestClass constructor must set PubInt to 0!", 0, tester.PubInt);

        /**
         * Modify privInt check
         * <p>
         *     -Passes if:
         *     <ul>
         *         <li>PubInt is changed to 5.</li>
         *     </ul>
         * </p>
         */
        tester.PubInt = 5;
        assertEquals("TestClass.PubInt must now be 5!", 5, tester.PubInt);
    }

    /**
     * Test for privInt accessors
     *
     * @throws Exception exceptions passed to caller
     */
    @Test
    public void testPrivIntAccessors() throws Exception {
        /**
         * Constructor check
         * <p>
         *     -Passes if:
         *     <ul>
         *         <li>privInt is initialized to 0.</li>
         *     </ul>
         * </p>
         */
        TestClass tester = new TestClass(); //Instantiate new TestClass object
        assertEquals("TestClass constructor must set privInt to 0!", 0, tester.getPrivInt());

        /**
         * Modify privInt check
         * <p>
         *     -Passes if:
         *     <ul>
         *         <li>privInt is changed to 3.</li>
         *     </ul>
         * </p>
         */
        tester.setPrivInt(3);
        assertEquals("Tester.privInt must now be 3!", 3, tester.getPrivInt());
    }
}