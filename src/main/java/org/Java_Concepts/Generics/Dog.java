package org.Java_Concepts.Generics;

public class Dog extends Animal {
    private String name;
    private int age;
     Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
         return name;
    }

    public int getAge() {
         return age;
    }
}
