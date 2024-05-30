package org.Java_Concepts.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListCompare {
    public static void main(String[] args) {
        ArrayList<String> l1 = ArrayListMethods.getTArrayList("a","b","c","d","e");//sorted arrayList
        ArrayList<String> l2 = ArrayListMethods.getTArrayList("a","e","c","d","b");//unsorted arrayList
        ArrayList<String> l3 = ArrayListMethods.getTArrayList("a","c","b","d","f");//

        Collections.sort(l1);
        Collections.sort(l2);

        System.out.println(l1.equals(l2));//true
        System.out.println(l1.equals(l3));//false
        System.out.println(l2.equals(l3));//false

        //2. compare two list - find out the additional elements:
        l1.retainAll(l3);
        System.out.println(l1);

        //3. find out the common elements:
        l1.removeAll(l3);
        System.out.println(l1);

    }

}
