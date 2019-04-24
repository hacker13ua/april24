package org.esurovskiy;

public class SingletonMain {
    public static void main(String[] args) {
        System.out.println(SingletonExample.getInstance().getDate());
        System.out.println(SingletonExample.getInstance().getDate());
        System.out.println(SingletonExample.getInstance()
                == SingletonExample.getInstance());
        System.out.println(SingletonEnumExample.INSTANCE.getDate());

        System.out.println(LazySingleton.getInstance().getDate());
    }
}
