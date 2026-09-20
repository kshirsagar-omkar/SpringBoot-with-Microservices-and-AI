package com.tca.util;

public class SingletonType1 {

    private static final SingletonType1 instance = new SingletonType1();

    private SingletonType1(){}

    public static SingletonType1 getInstance(){
        return instance;
    }


    /*

    Advantages : Thread Safe

    Diss Advantages : Memory Wastage

     */

}
