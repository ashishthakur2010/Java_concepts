package org.Java_Concepts.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {
        //no order -no indexing
        //Stores - <Key - Value>
        //only one null keys allowed
        //duplicate values allowed

        Map<String,String> map1 = new HashMap<String, String>();
        map1.put("India","Delhi");
        map1.put("UK","London");
        map1.put("USA","Washington");
        map1.put("","Kathmandu");
        map1.put(null,"Kathmandu1");
        map1.put(null,null);
        map1.put("UK","Manchester");
        map1.put("Germany","");
        map1.put("Pakistan",null);

       // System.out.println(map1);
        System.out.println(map1.get(null));
        System.out.println(map1.get("")+"\n");

        //iterator: keySet()
         Iterator<String> it= map1.keySet().iterator();
         while(it.hasNext()){
             String key= it.next();
             String value= map1.get(key);
             System.out.println(""+key+"-->"+value);
         }
         System.out.println("\n");

         //using entrySet()
         Iterator<Map.Entry<String,String>> it2= map1.entrySet().iterator();
         while (it2.hasNext()){

             Map.Entry<String,String> entry= it2.next();
             String key= entry.getKey();
             String value= entry.getValue();
             System.out.println(""+key+"-->"+value);

         }
        System.out.println("\n");

         //Lambda
         map1.forEach((k,v)-> System.out.println(""+k+"-->"+v));


    }
}
