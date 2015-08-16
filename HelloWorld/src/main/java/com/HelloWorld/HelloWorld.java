package com.HelloWorld;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * com.HelloWorld.HelloWorld Class
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 */
public class HelloWorld {
    /**
     * Main function for com.HelloWorld
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //Hello World!
        System.out.println("Hello World!");

        //Instantiate TestClass
        TestClass localTestClass = new TestClass();

        //Twiddle some bits
        localTestClass.setPrivInt(15);
        System.out.format("privInt = %d\r\n", localTestClass.getPrivInt());

        //Process command line args
        ArgsProcessor(args);

        //Line to be parsed
        String inputString = "This order was canceled for QT3000! OK?";

        //Pattern to match (RegEx)
        String pattern = "(\\b\\w*\\b)( for )(\\b\\w*\\d+\\b)";

        PatternMatching(inputString, pattern);
    }

    /**
     * Processes args array for HelloWorld.main()
     *
     * @param args String array of command line arguments
     */
    public static void ArgsProcessor(String[] args) {
        //Check out args
        int argCount = 0;
        if(null != args) {
            System.out.format("Found %d arguments!\r\n", args.length);
            for (String arg : args) {
                System.out.format("arg[%d] - \"%s\"\r\n", argCount, arg);
                argCount++;
            }
        }
        else
        {
            System.out.println("No args provided.");
        }
    }

    /**
     * Tryinng out Pattern and Matcher classes
     *
     * @param inputString String to be processed
     * @param pattern Pattern to match within inputString
     */
    public static void PatternMatching(String inputString, String pattern) {
        //Pattern object
        Pattern thePattern = Pattern.compile(pattern);

        //Matcher object
        Matcher theMatcher = thePattern.matcher(inputString);

        //Find matches
        int groupCount;
        int matchCount = 0;
        while(theMatcher.find())
        {
            matchCount++;
            groupCount = theMatcher.groupCount();
            System.out.format("Match Number %d, Group Count %d:\r\n", matchCount, groupCount);
            for(int groupID = 0; groupID <= groupCount; groupID++)
            {
                System.out.format("\t-Group(%d) = %s\r\n", groupID, theMatcher.group(groupID));
            }
        }
        if(0 == matchCount)
        {
            System.out.println("No match found!");
        }
        else
        {
            System.out.format("Total of %d matches found!\r\n", matchCount);
        }
    }
}