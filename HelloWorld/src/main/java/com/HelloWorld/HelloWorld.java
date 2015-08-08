package com.HelloWorld;

/**
 * com.HelloWorld.HelloWorld Class
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        TestClass localTestClass = new TestClass();

        localTestClass.setPrivInt(5);
        System.out.format("privInt = %d\r\n", localTestClass.getPrivInt());
    }
}