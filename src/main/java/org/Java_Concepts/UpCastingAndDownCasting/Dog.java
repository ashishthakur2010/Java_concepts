package org.Java_Concepts.UpCastingAndDownCasting;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Woof WooF!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void growl(){
        System.out.println("Bark: Grrrrrr!");
    }
}
