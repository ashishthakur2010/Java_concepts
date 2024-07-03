package org.Java_Concepts.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {


    public static ArrayList<Integer> getIntArrayList(int a, int b, int c, int d, int e) {
        ArrayList<Integer> ar = new ArrayList<>(Arrays.asList(a, b, c, d, e));
        return ar;
    }
    public static ArrayList<String> getStringArrayList(String a, String b, String c, String d) {
        ArrayList<String> ar = new ArrayList<>();
        ar.add(a);
        ar.add(b);
        ar.add(c);
        ar.add(d);
        return ar;
    }
    public static <T> ArrayList<T> getTArrayList(T a, T b, T c, T d, T e) {
        ArrayList<T> ar = new ArrayList<>(Arrays.asList(a,b,c,d,e));
        return ar;
    }
    public static <T> ArrayList<T> getTArrayList(T a, T b, T c, T d, T e,T f, T g, T h, T i, T j, T k, T l, T m, T n) {
        ArrayList<T> ar = new ArrayList<>(Arrays.asList(a,b,c,d,e,f, g,  h,  i,  j,  k,  l,  m,  n));
        return ar;
    }


    public static void main(String[] args) {
        System.out.println("          ****ArrayList Methods****\n");
        ArrayList<Integer> intArray1 = getIntArrayList(10, 20, 30, 40, 50);
        ArrayList<Integer> intArray2 = getIntArrayList(100, 200, 300, 400, 500);
        ArrayList<Integer> intArray3 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<String> stringArray = getStringArrayList("gb", "AT", "aS", "pd");
        ArrayList<String> genericArray = getTArrayList("gb", "AT", "aS", "pd", "sd");
        ArrayList<String> genericArray1 = getTArrayList("gb", "AT", "aS", "pd", "sd");
        ArrayList<String> genericArray2 = getTArrayList("gb", "AT", "aS", "pd", "sd");

        //Sorting
        Collections.sort(intArray1);
        System.out.println(intArray1);

        //set
        intArray1.set(0,80);
        System.out.println(intArray1);


        System.out.println("//all(index,array),addAll(array),array.clear()");
        ArrayList<Integer> partialCopyArrayList = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));
        partialCopyArrayList.addAll(4, intArray2);
        System.out.println(partialCopyArrayList);
        intArray1.addAll(intArray2);
        System.out.println(intArray1);
        System.out.println("genericArray"+genericArray);
        System.out.println("genericArray.isEmpty() "+genericArray.isEmpty());
        genericArray.clear();
        System.out.println(genericArray);
        System.out.println("genericArray.isEmpty() "+genericArray.isEmpty() + "\n");


        System.out.println("//.Clone() Method");
        ArrayList<Integer> cloneArray = (ArrayList) (intArray1.clone());
        ArrayList<Object> objClone = (ArrayList) intArray2.clone();
        ArrayList<String> stringClone = (ArrayList) stringArray.clone();
        System.out.println(cloneArray);
        System.out.println(objClone);
        System.out.println(stringClone + "\n");

        System.out.println("//.contains() & .indexOf() Method");
        System.out.println("stringArray.contains(500))= " + stringArray.contains(500));
        System.out.println("intArray2.contains(500))= " + (intArray2.contains(500)));
        System.out.println("intArray1.indexOf(500) =" + intArray1.indexOf(500));
        int i = intArray2.lastIndexOf(100);
        System.out.println("intArray2.lastIndexOf(100) =" + i + "\n");


        System.out.println("//remove(100,200,AT)");
        intArray2.remove((Integer) 200);
        intArray2.remove((Integer) 100);
        stringArray.remove("AT");
        System.out.println("intArray2 =" + intArray2 + "\n" + "stringArray =" + stringArray + "\n");


        System.out.println("//Collections.singleton,subList");
        genericArray1.retainAll(Collections.singleton("aS"));
        System.out.println("Collections.singleton =" + genericArray1);
        // Creating a sublist from the ArrayList
        ArrayList<String> subList = new ArrayList<>(genericArray2.subList(0, 3));
        System.out.println("subList =" + subList + "\n");

        System.out.println("removeIf()");
        intArray3.removeIf(number -> number % 2 != 0);
        System.out.println(intArray3);


    }
}
