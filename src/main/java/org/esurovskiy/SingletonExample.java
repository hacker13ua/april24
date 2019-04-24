package org.esurovskiy;

import java.util.Date;

public class SingletonExample {
    private static SingletonExample instance = new SingletonExample();

    private SingletonExample() {
    }

    public static SingletonExample getInstance() {
        return instance;
    }

    public Date getDate() {
        return new Date();
    }
}
