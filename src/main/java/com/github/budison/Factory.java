package com.github.budison;

/**
 * @author Kevin Nowak
 */
class Factory extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Factory());
        Thread t2 = new Thread(new Factory());
        Thread t3 = new Thread(new Factory());

        t1.start();
        t2.start();
        t3.start();

    }

    @Override
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.print(Thread.currentThread().getName() + " ");
        }
    }
}
