package com.github.budison;

class StaticMethods {
    static synchronized void wakeUp(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Guten Morgen: ");
            System.out.println(name);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ignored) {}
        }
    }

    static synchronized void goSleep(String name) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Gute Nacht: ");
            System.out.println(name);
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ignored) {}
        }
    }
}

class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        StaticMethods.wakeUp(name);
        StaticMethods.goSleep(name);
    }
}

class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();
    }
}