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
     * Test for PatternMatching() function
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Pattern with matches</li>
     *         <li>Pattern without matches</li>
     *     </ul>
     *
     * @throws Exception passes exceptions to caller
     */
    @Test
    public void testPatternMatching() throws Exception {
        String inputString = "This is an input String!";

        /**
         * Pattern with matches check
         *
         * Passes if:
         * -No exceptions thrown
         */
        String regExPatternMatch = "(\\b\\w*\\b)( an )(\\b\\w*\\b)"; //pattern search for '{word} an {word}'
        HelloWorld.PatternMatching(inputString, regExPatternMatch);

        /**
         * Pattern without matches check
         *
         * Passes if:
         * -No exceptions thrown
         */
        String patternNoMatch = "(\\b\\d+\\b)"; //pattern searching for '{digits}'
        HelloWorld.PatternMatching(inputString, patternNoMatch);
    }

    /**
     * Test for ArgsProcessor() function
     * <p>
     *     Checks:
     *     <ul>
     *         <li>Empty args</li>
     *         <li>Provided args</li>
     *     </ul>
     *
     * @throws Exception passes exceptions to caller
     */
    @Test
    public void testArgsProcessor() throws Exception {
        /**
         * Empty args check
         *
         * Passes if:
         * -No exceptions thrown
         */
        HelloWorld.ArgsProcessor(null);

        /**
         * Provided args check
         *
         * Passes if:
         * -No exceptions thrown
         */
        String[] argsInput = {"Arg1", "Arg2"};
        HelloWorld.ArgsProcessor(argsInput);
    }
}