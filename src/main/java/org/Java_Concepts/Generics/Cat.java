package org.Java_Concepts.Generics;

public class Cat extends Animal {
    private String name;
    private int age;
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
