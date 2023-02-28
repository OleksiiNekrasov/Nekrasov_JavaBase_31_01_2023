package com.hillel.nekrasov.home_works.works11;

import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int m = 0;

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
        }
        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];
        System.out.println("your n =  " + n);
        System.out.println("your m =  " + m);

            


        System.out.println("Before");
        for (n = 0; n < array1.length; n++) {
            for ( m = 0; m < array1.length; m++) {
                array1[n][m]=(int)(Math.random()*11);
            }
    }
for ( n = 0; n < array1.length; n++, System.out.println()){
        for (m =0; m < array1[n].length; m++){
            System.out.print(array1[n][m]+" ");

            }
            System.out.println();
        }
  //      for ( m = 0; m < array2.length; m++) {
  //          for (n = 0; n < array2.length; n++) {
  //              System.out.print(array2[m][n] + " ");
  //          }
   //         System.out.println();
        }

    }







