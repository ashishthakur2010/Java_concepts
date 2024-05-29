package org.Java_Concepts.Generics;

public class ExampleWithGeneric {


    public static void main(String[] args) {
        // Generics in Java allow for creating flexible classes that can work with different types of data without the need for code duplication.
        // generics = enable types (classes and interfaces) to be parameters when defining: classes, interfaces and methods
        // By using generics, you can create a single class that can handle multiple types, improving code reusability and reducing redundancy.
        // a benefit is to eliminate the need to create multiple versions
        // of methods or classes for various data types.
        // Use 1 version for all reference data types

        Integer[] arr = {2, 4, 5, 7, 9};
        String[] arr2 = {"a", "b", "c"};
        Double[] arr3 = {2.0, 3.0, 4.0, 5.0};
        Character[] arr4 = {'a', 'b', 'c'};
        Boolean[] arr5 = {true, false};

        getArr(arr);
        getArr(arr2);
        getArr(arr3);
        getArr(arr4);
        getArr(arr5);

        getFirst(arr);
        getFirst(arr2);
        getFirst(arr3);
        getFirst(arr4);
        getFirst(arr5);
    }

    public static <T> void getArr(T[] arr) {
        for (T i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }

    public static <T> void getFirst(T[] arr) {
        System.out.println(arr[0]);
    }

}
