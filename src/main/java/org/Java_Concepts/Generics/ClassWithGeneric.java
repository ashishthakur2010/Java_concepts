package org.Java_Concepts.Generics;

import java.util.ArrayList;
import java.util.List;

public class ClassWithGeneric {
    public static void main(String[] args) {
        MyGenericTypeClass<Integer> myInt = new MyGenericTypeClass<>(1);
        MyGenericTypeClass<Double> myDouble = new MyGenericTypeClass<>(8.4);
        // MyGenericTypeClass<String> myString = new MyGenericTypeClass<>("GP");
        // MyGenericTypeClass<Character> myChar = new MyGenericTypeClass<>('a');

        System.out.println(myInt.getMyType());
        System.out.println(myDouble.getMyType());
        // System.out.println(myString.getMyType());
        // System.out.println(myChar.getMyType());

        //Type Safety
        ArrayList<Cat> cat = new ArrayList<>();
        cat.add(new Cat("Meao",6));//Generics provide type safety so,
       // cats.add(new Dog("Jack",7));          this is not allowed as it catches error if you try to pass an incompatible type.

        ArrayList<Object> cats = new ArrayList<>();
        cats.add(new Cat("Jack",7));

       // Cat myobj = cats.get(0);   this gives type Mismatch error, you cant convert from object to cat, java doesn't know that this is supposed to be a list of cats
                                  // it just knows it's a list of objects so we have to tell java yes i know this is a cat so you can go ahead and cast it to a cat
                                  // so you can go ahead and cast it to a cat so i can store it in this variable.
          Cat myobj = (Cat)cats.get(0);

     //   cat. add(new Dog("Jack",7)); but what if instead of adding a cat to the list somebody adds a dog well the code all looks the same there's no compilation
                                               // errors or anything but of course if you try to run it you're going to get a classcast exception.
                                               // code all looks the same there's no compilation errors or anything
                                               // if we writh the code like this then it causes all sorts of types safty issues and generic solves this.
         //Wild cards
        //let's say we wanted to be able to create a method that can take in a list that holds any type of objects and we want to be able to print out that list so we
        //might call that print list.

        List<Integer> intList = new ArrayList<>(); //we can try and call our print list method with our int list as the parameter
        intList.add(3);
        printList(intList);                        //but if we try and do that we get an Error here that says we can't pass in this list of integers as this parameter that's
                                                   //supposed to be a list of objects
    }
       // private static void printList(List<Object> myList){  //
         //    System.out.println(myList);

    //that right of course an integer is a
    //subclass of object so shouldn't we be
    //able to pass in just a list of integers
    //well even though integer is a subclass
    //of object a list of integers is not a
    //subclass of a list of objects so this
    //doesn't work this is where a <?>wild card
    //will work to solve your problem

       private static void printList(List<?> myList){  //
           System.out.println(myList);
          //instead of saying that this is a list of
           //objects we say that this is going to be
           //a list of unknown by passing in a
           //question mark this question mark is the
           //wild card you use a wild card a question
           //mark as the type parameter when you're
           //using a generic when you don't know
           //what exactly that generic type is going
           //to be so it's saying hey java i've got
           //this method here and i want it to be
           //able to take in a list of anything but i
           //don't know what it's going to be a list
           //of so now you can call this method with
           //a list of whatever you want in this case
           //we're doing it with a list of integers
           //but you can also do it with a list of
           //anything else



           //In summary, Generic<T> is used when you want a specific type for your class (like a box for storing only strings or only integers), while <?> (wildcard)
           // is used when you want to represent a collection of unknown types (like a storage room that can hold any type of box).

    }
}
