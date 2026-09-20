package com.tca.util;

public class SingletonType3 {

    private static SingletonType3 instance;

    private SingletonType3(){}

    public synchronized static SingletonType3 getInstance(){
        if(instance == null){
            instance = new SingletonType3();
        }
        return instance;
    }



    /*

    Advantages : Thread Safe, No Wastage of Memory, Lazy Initialization

    Diss Advantages : Performance issue BCZ of synchronized method

            if there are multiple thread running then all others have to wait until on thread has finished doing his work

     */
}
