package com.hillel.nekrasov.home_works.lessons1;

import java.util.Random;
import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n=0;
        int m=0;
        int[][] a = new int[n][m];



        System.out.println("Please enter number1  and number2");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            m = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
    //        int[][] a = new int[n][m];
            int i,j;
            for (i = 0; i < n; i++) {
                for ( j = 0; j < m; j++) {
      //              a[n][m] = (int) (Math.random() * 101);
                    a[i][j] = random.nextInt();
                    System.out.print(a[i][j] + " ");
                }

            }
        //    for (int i=0;i < n;i++,System.out.println()){
        //    for ( int j=0;j < m;j++){
         //       System.out.print(a[i][j]+" ");
            }}
    }


