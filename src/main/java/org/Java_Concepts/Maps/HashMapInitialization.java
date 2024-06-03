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
        // marksMap = new HashMap<>();
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
        Map<String,String> map4 = Stream.of
            (new String[][]{
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



        //JDK 1.9: //Immutable Maps
        //1 empty map:
        Map<String,String> map7 = Map.of();
        //map7.put("GT", "JavaScript"); UnsupportedOperationException
        System.out.println(map7);

        //2 SingleTonMap
        Map<String,String> map8 = Map.of("AT","Java");
        //map7.put("GT", "JavaScript"); UnsupportedOperationException
        System.out.println(map8);

        //3 MultivaluedMap: max 10 pairs can be stored: and you cant store any iteam using put()
        Map<String,String> map9 = Map.of("AT","Java"
                ,"GP2","JavaScript2","GP3","JavaScript3","GP4","JavaScript4","GP5","JavaScript5"
                ,"GP6","JavaScript6","GP7","JavaScript7","GP8","JavaScript8","GP9","JavaScript9"
                ,"GP10","JavaScript10");
       // map9.put("GP11","JavaScript11");
        System.out.println(map9);

        //4 ofEntries method: no limitations on pairs (key—value)
        // Immutable Map:
          Map<String,Integer>map10 = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A",100),
                new AbstractMap.SimpleEntry<>("B",200),
                new AbstractMap.SimpleEntry<>("C",300),
                new AbstractMap.SimpleEntry<>("D",400),
                new AbstractMap.SimpleEntry<>("E",500),
                new AbstractMap.SimpleEntry<>("F",600),
                new AbstractMap.SimpleEntry<>("G",700));
            //map10.put("H",800);  UnsupportedOperationException
          System.out.println(map10);

          //Maps Using Guava:
       // Map<String,String> map11 = ImmutableMap.of("A", "B");


    }
}
