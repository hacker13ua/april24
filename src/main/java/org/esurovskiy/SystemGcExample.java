package org.esurovskiy;

import java.io.IOException;

public class SystemGcExample {
    public static void main(String[] args) throws InterruptedException, IOException {
        Thread.sleep(1500);
        System.out.println("Start");
        System.out.println("Перед инициализацией"
                + Runtime.getRuntime().freeMemory());
        Runtime.getRuntime().exec("kate");
       /* while (true) {
            int array[] = new int[10000];
            Thread.sleep(200);
            System.out.println(
                    Runtime.getRuntime().freeMemory());
//            System.gc();
        }*/
//        System.gc();
    }
}
