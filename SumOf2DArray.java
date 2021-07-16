package com.gaurav;

import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows in the first matrix :");
        int noOfRows = sc.nextInt();
        System.out.println("enter the no of columns in the first matrix :");
        int noOfCols = sc.nextInt();
        int [][] a = new int[noOfRows][noOfCols];
        System.out.println("Enter the elements of matrix a");
        for (int i=0;i<noOfRows;i++){
            for (int j=0;j<noOfCols;j++){
                a[i][j]= sc.nextInt();
            }
        }

        int [][] b = new int[noOfRows][noOfCols];
        System.out.println("Enter the elements of matrix b");
        for (int i=0;i<noOfRows;i++){
            for (int j=0;j<noOfCols;j++){
                b[i][j]= sc.nextInt();
            }
        }
        int [][] c = new int[noOfRows][noOfCols];
        for (int i=0;i<noOfRows;i++){
            for (int j=0;j<noOfCols;j++){
                    c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Result array c is:");
        for (int i=0;i<noOfRows;i++) {
            for (int j = 0; j < noOfCols; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
