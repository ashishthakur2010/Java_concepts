package org.Java_Concepts.Collections.HashSet;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
    private final int MAX_VALUE = 1000000;
    private final int ARRAY_SIZE = 100;
    private List<List<Integer>> parentList ;

    public MyHashSet() {
      parentList = new ArrayList<>(ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            parentList.add(null);
        }
    }

    public void addEle(int key){
        int index = key % ARRAY_SIZE; //888->8
        List<Integer> node = parentList.get(index);// arr.get(5) ar.get(i)
        if(node == null){
            List<Integer> newList = new LinkedList<>();
            newList.add(key);
            parentList.set(index, newList);
        }
        else {
            if(!node.contains(key)){
                node.add(key);
            }
        }
    }

    public void remove(int key){
        int index = key % ARRAY_SIZE; // 888 -> 8
        List<Integer> childList = parentList.get(index); // 8->NULL
        if(childList != null){
            childList.remove(Integer.valueOf(key));
        }
    }

    public boolean contains(int key){
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(key);
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.addEle(1);
        set.addEle(2);
        set.addEle(3);
        set.addEle(4);
        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(2)); // true
        System.out.println(set.contains(3)); // true
        System.out.println(set.contains(4)); // true
        System.out.println(set.contains(5)); // false
        set.remove(2);
        System.out.println(set.contains(2)); // false
    }
}
