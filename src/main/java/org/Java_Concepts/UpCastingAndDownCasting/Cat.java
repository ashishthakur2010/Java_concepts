package org.Java_Concepts.UpCastingAndDownCasting;

public class Cat extends Animal {
    String name;

    @Override
    public void makeNoise() {
        System.out.println("Meao!");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void growl(){
        System.out.println("OoooAAoouu!");
    }
}
