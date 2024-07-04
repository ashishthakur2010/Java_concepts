package org.Java_Concepts.Collections.LinkedList;

import java.util.*;

public class LinkedListMethod {

    public static void main(String[] args){

        //LL is a default class in java
        //it can be used as List, stack, Queue
        //it allows the null entry
        //dynamic collection
        //hence insertion and deletion can be easily implemented
        //it can content duplicate elements
        //it is not synchronized(not thread safe)
        //in LL, manipulation is fast because we don't need any shifting.

        //LL constructors:
        //LinkedList();
        //LinkedList(Collection c)

        LinkedList<String> names = new LinkedList<>();
         System.out.println(names.size()) ;

        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next()) ;
        }
        System.out.println("it.next()");

         names.add("Tom");
         names.add("Ashish");
         names.add("Gyaneh");
        System.out.println(names.size()) ;

        System.out.println(names) ;
        System.out.println(names.get(0)) ;

        Iterator<String> it1 = names.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next()) ;
        }

        names.add(3,"Pratyush");
        System.out.println(names) ;

        names.add(2,"Lisa");
        System.out.println(names) ;

        LinkedList<String> users = new LinkedList<>();
        users.add("Susil");
        users.add("Foke");

        names.addAll(3,users) ;
        System.out.println(names) ;

        names.addFirst("Kamala");
        names.addLast("Vimla");
        System.out.println(names) ;

        Iterator<String> it2 = names.descendingIterator();
        while(it2.hasNext()){
            System.out.println(it2.next()) ;
        }

      //  names.removeFirst();

        //names.removeLast();
       // System.out.println(names) ;

        names.removeAll(users);
        System.out.println(names) ;

        Collections.sort(names);
        System.out.println(names) ;

        List<Integer> nums = new LinkedList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);

        //nums.removeIf(ele->ele%2!=0);

        nums.forEach(System.out::println);
        nums.forEach(ele->System.out.println(ele));

        for (int n : nums) {
            System.out.println(n);
        }

       // System.out.println(nums) ;


    }
}
