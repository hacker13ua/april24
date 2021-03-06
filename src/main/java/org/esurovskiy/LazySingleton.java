package org.esurovskiy;

import java.util.Date;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        System.out.println("Init lazy singleton");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public Date getDate(){
        return new Date();
    }
}
