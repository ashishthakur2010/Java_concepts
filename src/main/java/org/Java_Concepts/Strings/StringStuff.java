package org.Java_Concepts.Strings;

public class StringStuff {

    public static void main(String[] args) {

        String firstName = "John";
        String lastName = "Peterson";

        String fullName = firstName + " " + lastName;

        int fullNameLength = fullName.length();

        System.out.println(fullNameLength);

        System.out.println(fullName.charAt(0));

        System.out.println(fullName.toUpperCase());
        System.out.println(firstName.toUpperCase());

    }

}
