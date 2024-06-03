package org.Java_Concepts.Maps;

import java.util.*;
import java.util.Map.Entry;

public class HashMapToArrayList {
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        System.out.println(map.size());
        System.out.println(map.get("d"));

           Iterator it = map.entrySet().iterator();
                 Entry pair = (Entry) it.next();
                 System.out.println(pair.getKey() + " = " + pair.getValue());

//           while (it.hasNext()){
//               Map.Entry pair = (Map.Entry) it.next();
//               System.out.println(pair.getKey() + " = " + pair.getValue());
//           }

           System.out.println(map.keySet()+""+ map.values());
           //map.forEach((k,v) -> System.out.println(map.keySet()));

           List<String> list = new ArrayList<>(map.keySet());
           System.out.println(list);

           List<Integer> list1 = new ArrayList<>(map.values());
           System.out.println(list1);

    }
}
