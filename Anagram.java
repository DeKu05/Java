package com.gaurav;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word/Line");
        String a = sc.nextLine();
        System.out.println("Enter the second word/Line");
        String b = sc.nextLine();

        a = a.replace(" ","");
        b = b.replace(" ","");

        a = a.toLowerCase();
        b = b.toLowerCase();

        char x[] = a.toCharArray();
        char y[] = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        Boolean Result = Arrays.equals(x,y);

        if (Result==true){
            System.out.println("It is An ANAGRAM");
        }
        else{
            System.out.println("Not an ANAGRAM");
        }
    }
}
