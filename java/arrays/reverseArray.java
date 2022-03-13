package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[]={34,56,54,32,67,89,90,32,21};
        int n = arr.length;

        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+",");
        }
    }
}
