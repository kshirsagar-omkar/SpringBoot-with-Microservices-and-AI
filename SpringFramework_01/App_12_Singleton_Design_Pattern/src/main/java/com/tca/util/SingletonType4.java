package com.tca.util;

public class SingletonType4 {

    private static SingletonType4 instance;

    private SingletonType4(){}

    public static SingletonType4 getInstance(){
        if(instance==null){
            synchronized (SingletonType4.class){
                if(instance==null){
                    instance=new SingletonType4();
                }
            }
        }
        return instance;
    }



    /*

    This method is called "double-checking" with thread safety, it is used to reduce the overhead of calling synchronized method every time.


    Advantages : Thread Safe, No Wastage of Memory, Lazy Initialization, Good Performance


     */
}
