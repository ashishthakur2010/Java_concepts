package org.Java_Concepts.Generics;

public class Dog extends Animal {
    private final String name;
    private final int age;
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
