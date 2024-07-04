package org.Java_Concepts.Collections.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetMethods {

    public static void main(String []args){
        HashSet<String> emp = new HashSet<>();

        emp.add("John");
        emp.add("Jane");
        emp.add("Bob");
        emp.add("Mary");
        emp.add(null);

        System.out.println(emp.add("John"));
        emp.remove("John");
        System.out.println(emp.add("John"));

        System.out.println(emp);
        System.out.println(emp.contains("John"));

//        for(String item : emp){
//            System.out.println(item);
//        }
//
//        Iterator<String> it = emp.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        emp.forEach(ele->System.out.println(ele));
//        emp.forEach(System.out::println);

        Set<Integer> ls1 = new HashSet<>();
        ls1.addAll(Arrays.asList(new Integer[]{1,2,4,5,6,5,8,10}));

        Set<Integer> ls2 = new HashSet<>(Arrays.asList(new Integer[]{1,3,5,7,9}));

        Set<Integer> union = new HashSet<>(ls1);
        union.addAll(ls2);
        System.out.println(union);
        System.out.println("-------------------------");

        Set<Integer> intersection = new HashSet<>(ls1);
        intersection.retainAll(ls2);
        System.out.println(intersection);
        System.out.println("-------------------------");

        Set<Integer> difference = new HashSet<>(ls1);
        difference.removeAll(ls2);
        System.out.println(difference);

        System.out.println(difference.hashCode());











    }

}
