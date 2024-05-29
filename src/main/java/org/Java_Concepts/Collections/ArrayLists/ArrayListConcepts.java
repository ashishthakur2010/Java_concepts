package org.Java_Concepts.Collections.ArrayLists;

import java.util.*;
public class ArrayListConcepts {

    private static ArrayList getObjects() {  //Creating Raw ArrayList
        ArrayList ar = new ArrayList<>();
        ar.add(10);//0
        ar.add("s");
        ar.add("String");
        ar.add(24.65);
        ar.add('g');
        return ar;
    }

    public static void main(String[] args) {

        //dynamic array -- Arraylist:
        //1: size is not fixed
        //2: duplicates are allowed
        //3: null is allowed.
        //4: allows random access to fetch the element because it stores the value in the basis of indexing.
        //5: ArrayList is not synchronized by default in Java.
        System.out.println("         ****dynamic array -- Arraylist:****");

        System.out.println("//Raw use of collection ArrayList:");
        ArrayList<Object> ar = getObjects(); //Raw use of collection ArrayList
        System.out.println(ar);

        System.out.println("//older for loop:");
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
        System.out.println("//enhance for loop:");
        for (Object o : ar) {
            System.out.println(o);
        }

        System.out.println("//Using Iterator:");
        Iterator<Object> itr = ar.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("//Using lambda:");
        ar.forEach(element -> System.out.println(element));
        System.out.println("//Using Streams with lambda:");
        ar.stream().forEach(element -> System.out.println(element));
        System.out.println("//Using Method references: ");
        ar.forEach(System.out::println);


        System.out.println("//Using generic");
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
//list.stream().forEach(element -> System.out.println(element));


    }


}
