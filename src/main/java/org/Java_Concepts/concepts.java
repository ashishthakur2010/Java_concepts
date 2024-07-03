package org.Java_Concepts;
import java.util.Scanner;

public class concepts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int A = sc.nextInt();

        if (A>0)
            System.out.println("Positive");
        else if (A<0)
            System.out.println("negative");
        else
            System.out.println("0");
    }

}
