package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int[] rep=new int[10];
        for(int i =0;i<10;i++){
            rep[i]=0;
        }
        Scanner sc = new Scanner(System.in);
        int n;
        int rem=0;
        n= sc.nextInt();
        while (n>0){
            rem = n % 10;
            rep[rem]=rep[rem]+1;
            n=n/10;
        }

        int count=0;
        for(int i = 0; i<10;i++){
            if(rep[i]>1){
                System.out.println("yes there is repetetion of: "+ i);
                count++;
            }
        }
        if(count==0){
            System.out.println("No digit is repeated");
        }
    }

}
