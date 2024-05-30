package org.Java_Concepts.UpCastingAndDownCasting;

public abstract class Animal {
    String name;

    public void makeNoise(){
        System.out.println("I am an animal");
    }
    public void eat(){
        System.out.println("Eating!!");
    }
    public abstract void sleep();

}
