package org.Java_Concepts.EnumsSet;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetConcepts {

    enum Lang{
        JAVA,CSHARP,JAVASCRIPT,PYTHON,RUBY,RUST,GO
    }

    public static void main(String[] args) {
        //Creating new EnamSet using the enums
        EnumSet<Lang> language = EnumSet.allOf(Lang.class);
        System.out.println(language);

        //Empty enum set:
        EnumSet<Lang> language2 = EnumSet.noneOf(Lang.class);
        System.out.println(language2);

        //range(e1,e4):
        EnumSet<Lang> language3 = EnumSet.range(Lang.JAVA, Lang.PYTHON);
        System.out.println(language3);

        //of:one/Multiple
        EnumSet<Lang> language4 = EnumSet.of(Lang.JAVA);
        System.out.println(language4);

        EnumSet<Lang> language5 = EnumSet.of(Lang.JAVA, Lang.RUST, Lang.PYTHON);
        System.out.println(language5);

        //Add and AddAll():
        EnumSet<Lang> language6 = EnumSet.allOf(Lang.class);
        EnumSet<Lang> language7 = EnumSet.noneOf(Lang.class);
        language7.add(Lang.JAVA);
        System.out.println(language7);
        language7.addAll(language6);
        System.out.println(language7);

        //Iterate
        EnumSet<Lang> language8 = EnumSet.allOf(Lang.class);
//        Iterator<Lang> itr = language8.iterator();
//        while (itr.hasNext()) {
//            Lang lang = itr.next();
//            System.out.println(lang);
//        }
//
//        for (Lang lang : language) {
//            System.out.println(lang);
//        }
//        language8.forEach(element -> System.out.println(element));
//        language8.forEach(System.out::println);

        //Remove() and removeAll();
        EnumSet<Lang> language9 = EnumSet.allOf(Lang.class);
        language9.remove(Lang.JAVA);

        if(language9.remove(Lang.JAVA))
            System.out.println(language9);
        else
            System.out.println("nO CHANGE");


        language9.removeAll(language9);
        System.out.println(language9);



    }
}
