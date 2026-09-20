package com.tca.util;

public class SingletonType2 {

    private static SingletonType2 instance;

    private SingletonType2(){}

    public static SingletonType2 getInstance(){
        if(instance == null){
            instance = new SingletonType2();
        }
        return instance;
    }

    /*

    Advantages : No Memory Wastage

    Diss Advantages : No Thread Safe

     */

}
