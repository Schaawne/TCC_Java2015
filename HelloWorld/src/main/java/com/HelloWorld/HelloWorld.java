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
    public static void main(String[] args) {
        //Hello World!
        System.out.println("Hello World!");

        //Instantiate TestClass
        TestClass localTestClass = new TestClass();

        //Twiddle some bits
        localTestClass.setPrivInt(15);
        System.out.format("privInt = %d\r\n", localTestClass.getPrivInt());

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

        //Line to be parsed
        String line = "This order was canceled for QT3000! OK?";

        //Pattern object
        String pattern = "(\\b\\w*\\b)( for )(\\b\\w*\\d+\\b)";
        Pattern thePattern = Pattern.compile(pattern);

        //Matcher object
        Matcher theMatcher = thePattern.matcher(line);

        //Find matches
        int groupCount = 0;
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
            System.out.format("Total of %d matches found!", matchCount);
        }
    }
}