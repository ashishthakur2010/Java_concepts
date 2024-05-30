package org.Java_Concepts.Collections.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

//Collections.synchronizedList: Wraps the ArrayList in a synchronized wrapper.
//CopyOnWriteArrayList: Suitable for scenarios with more reads than writes.
//Synchronized Blocks: Provides fine-grained control over synchronization.
//Choosing the right approach depends on your specific use case and performance considerations.
// If you have a scenario where reads are frequent and writes are rare, CopyOnWriteArrayList can be very efficient.
// For general use, Collections.synchronizedList is simpler to implement. For more complex synchronization needs,
// synchronized blocks offer the most flexibility.

public class SynchronizedArrayList {
     public static void main(String[] args) {
         //1:Using "Collections.synchronizedList" Synchronized Wrapper:
         List<String> names = Collections.synchronizedList(new ArrayList<>());
         names.add("Java");
         names.add("Python");
         names.add("C");
         names.add("Ruby");
         System.out.println(names);
         Iterator<String> it = names.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }
         //2:Using Synchronized Blocks:
         List<String> list =new ArrayList<>();
         synchronized (list){
             list.add("Java");
             list.add("Python");
             list.add("C++");
             list.add("Ruby");

             Iterator<String> it1 = list.iterator();
             while(it1.hasNext()){
                 System.out.println(it1.next());
             }
         }
         System.out.print(list);
         //3:Using copyOnWriteArrayList
         CopyOnWriteArrayList<String> copyOnWriteArrayList =new CopyOnWriteArrayList<>();
         copyOnWriteArrayList.add("Java");
         copyOnWriteArrayList.add("Python");
         copyOnWriteArrayList.add("C++");
         copyOnWriteArrayList.add("Ruby");

         System.out.println(copyOnWriteArrayList);


     }
}
