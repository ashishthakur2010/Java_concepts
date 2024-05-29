package org.Java_Concepts.Generics;

public class ClassWithoutGeneric {
    public static void main(String[] args) {
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyStringClass myString = new MyStringClass("GP");
        MyDoubleClass myDouble = new MyDoubleClass(5.3);
        MyCharClass myChar = new MyCharClass('e');

        System.out.println(myInt.getMyInteger());
        System.out.println(myString.getMyString());
        System.out.println(myDouble.getMyDouble());
        System.out.println(myChar.getMyChar());

    }





}
