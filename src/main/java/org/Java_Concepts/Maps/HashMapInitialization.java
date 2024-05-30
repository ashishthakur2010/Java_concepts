package org.Java_Concepts.Maps;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitialization {
    public static int a;

   public static Map<String,Integer> marksMap = new HashMap<>();
     static{
        marksMap.put("key", 100);
        marksMap.put("key2", 200);
    }


    public static void main(String[] args) {

        //1. using HashMap Class
        HashMap <String,String> map1 = new HashMap<>(); //normal instance creation
        Map<String,String> map2 = new HashMap<>();      // Top level instance creation

        //2. static way : static hashmap:
        HashMapInitialization.marksMap.put("key",200);
        System.out.println(HashMapInitialization.marksMap.get("key")+"\n");

       //3.  Map with immutable only one entry:
        Map<String,String> singletonImmutableMap=Collections.singletonMap("key","value");
        //singletonImmutableMap.put("key","value1"); its not allowed to add any more entries.
        System.out.println(singletonImmutableMap.get("key")+"\n");

        //4. Jdk 8
        // 2 Map or 2D Map
        Map<String,String> map4 = Stream.of(new String[][]{
                {"GP","cricket"},
                {"AT","cricket"},
        }).collect(Collectors.toMap(data -> data[0],data -> data[1]));
        System.out.println("GP "+map4.get("GP")+"\n");
        map4.put("Gp","Soccer");
        System.out.println("Gp "+map4.get("Gp")+"\n");

        //using SimpleEntry: mutableMap:
        Map<String,String> map5 = Stream.of(
                new AbstractMap.SimpleEntry<>("GP","cricket"),
                new AbstractMap.SimpleEntry<>("AT","Soccer")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

        System.out.println("AT "+map5.get("AT")+"\n");
        map5.put("KT","C#");
        System.out.println("KT "+map5.get("KT")+"\n");

        //using SimpleEntry: Immutable Map:
        Map<String,String> map6 = Stream.of(
                new AbstractMap.SimpleImmutableEntry<>("GP","JAVA"),
                new AbstractMap.SimpleImmutableEntry<>("AT","JavaScript")
        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
                //(oldValue,newValue) -> oldValue));

        System.out.println("AT "+map6.get("AT")+"\n");
        map6.put("KT","C#");
        System.out.println("KT "+map6.get("KT")+"\n");

        //5. using Map.Entry:
//        Map<String,String> map7 = Stream.of(
//                new AbstractMap.SimpleEntry<>("GP","cricket"),
//                new AbstractMap.SimpleEntry<>("AT","Soccer")
//        ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));



    }
}
