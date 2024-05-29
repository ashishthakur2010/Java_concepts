package org.Java_Concepts.MultiThreading;
//not use of extending Main or Shape here but this Java_Concepts shows advantage
// of using multipal Interface over a Single class.

import org.Java_Concepts.Main;
import org.Java_Concepts.Shape;

public class Threading extends Main implements Runnable, Shape {

    private int threadNumber;
    public  Threading(int threadNumber) {
        this.threadNumber = threadNumber;
    }
        public void run(){
            for(int i =1 ; i <= 5; i++){
                System.out.println(i+ " from the thread "+threadNumber);//{1 2 3 4}
//                if(threadNumber == 4){//{1 2 3 4}
//                    throw new RuntimeException(); //{1 2 3}
//                }
            try{
                Thread.sleep(1000);
               }  catch(InterruptedException e) {} //
            }
        }

    }
