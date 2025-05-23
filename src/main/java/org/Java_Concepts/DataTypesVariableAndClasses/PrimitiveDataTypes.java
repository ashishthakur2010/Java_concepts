package org.Java_Concepts.DataTypesVariableAndClasses;

/*We'll learn all about the 8 primitive data types in Java:

byte
short
int
long
float
double
boolean
char*/

// most basic data
//


public class PrimitiveDataTypes {

    public static void main(String[] args) {
    //these types only support numbers range in between mentioned below.

        // -128 to 127
        byte myByte = 12;

        // -32,768 to 32,767 - Never use this really
        short myShort = 1234;

        // -2,147,483,648 to 2,147,483,647
        int	myInt = 2837;
        String myString = "Hello there";

        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long myLong = 12323;

        // about 6 decimal digits
        float myFloat = 6.3f; // the limit is digit 6 after "."

        // about 15 decimal digits
        double myDouble = 45.213434;

        // true or false
        boolean myBoolean = false;
        boolean moreThan1000 = (myInt > 1000);

        // one character
        char myChar = 'W'; // holds only one char
    }
}
