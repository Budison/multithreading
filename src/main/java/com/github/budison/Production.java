package com.github.budison;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Kevin Nowak
 */
class Production {
    static Thread hundert = new Thread(() ->
            new Random().ints(10).forEach(System.out::println), "new");

    public static void main(String[] args) throws InterruptedException {
        hundert.start();
        hundert.join();
    }
}

