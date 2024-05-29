package org.Java_Concepts.MultiThreading;

public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <=4; i++) {
            Threading thread = new Threading(i);
            Thread mythread = new Thread(thread);
            mythread.start(); //{1 2 3 4}
//             boolean alive = mythread.isAlive();
//             System.out.println("before thread starts "+alive);
            mythread.join();
            boolean alive1 = mythread.isAlive();
            System.out.println("after thread work is done "+alive1);
        }
        //throw new RuntimeException();
    }
}
