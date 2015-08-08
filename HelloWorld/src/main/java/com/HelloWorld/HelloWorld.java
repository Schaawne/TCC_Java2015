package com.HelloWorld;

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
    }
}