package org.Java_Concepts.Generics;

public class ExampleWithoutGeneric {

    public static void main(String[] args) {

        Integer[] intArr ={2,5,8,3};
        String [] strArr ={"a","b","c"};
        Double[] doubleArr ={1.1,2.2,3.3};
        Character[] charArr ={'a','b','c'};
        Boolean[] boolArr ={true,false};

       getArr(intArr);
       getArr(strArr);
       getArr(doubleArr);
       getArr(charArr);
       getArr(boolArr);

    }
    public static void getArr(Integer[] arr) {
        for(Integer i : arr){
            System.out.println(i);
        }
    }
    public static void  getArr(String[] arr) {
        for(String s : arr){
            System.out.println(s);
        }
    }
    public static void getArr(Double[] arr) {
        for(Double d : arr){
            System.out.println(d);
        }
    }
    public static void  getArr(Character[] arr) {
        for(Character c : arr) {
            System.out.println(c);
        }
    }
    public static void  getArr(Boolean[] arr) {
        for(Boolean b : arr){
            System.out.println(b);
        }
    }
}
