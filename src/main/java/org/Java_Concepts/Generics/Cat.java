package org.Java_Concepts.Generics;

public class Cat extends Animal {
    private final String name;
    private final int age;
     Cat(String name, int age) {
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
