package org.Java_Concepts.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicateElements {

    //duplicate ele removing
    //Print arraylist using Lambda
    //removing duplicates using stream
    //print using method reference.

    public static void main(String[] args) {
        ArrayList<Integer> intArray =ArrayListMethods.getTArrayList(1,11,2,4,5, 1,7,5,4,10,1,1,3,14);

       //1:LinkedHashSet
        LinkedHashSet<Integer> intArraySet =new LinkedHashSet<>(intArray);
        System.out.println(intArraySet);
        ArrayList<Integer> intArrayList =new ArrayList<>(intArraySet);
        System.out.println(intArrayList);

       //2:Java Stream
        // -with Lamda:
        intArray.stream().distinct().forEach(ele->System.out.println(ele));
        // -with Method references:
        intArray.stream().distinct().forEach(System.out::println);
        // -with collectors.toList():
        List<Integer> newList=intArray.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);


    }
}
