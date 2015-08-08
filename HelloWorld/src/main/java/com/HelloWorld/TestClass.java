package com.HelloWorld;

/**
 * Created by Schaawne on 8/7/2015.
 *
 * @author Sean Blanton
 * @version 0.0.0.1
 */
public class TestClass {
    private int privInt;
    public int PubInt;

    /**
     * Public Constructor for TestClass
     *<p>
     * Initializes instance variables.
     *</p>
     */
    public TestClass() {
        privInt = 0;
        PubInt = 0;
    }

    /**
     * Getter for privInt
     *
     * @return value of privInt instance variable
     */
    public int getPrivInt() {
        return privInt;
    }

    /**
     * Setter for privInt
     *
     * @param privInt private instance integer variable
     */
    public void setPrivInt(int privInt) {
        this.privInt = privInt;
    }


}