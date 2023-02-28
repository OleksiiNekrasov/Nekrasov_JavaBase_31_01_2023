package com.hillel.nekrasov.home_works.lessons;

import java.util.Arrays;

public class Mine {
    public static void main(String[] args) {
        int[] array = new int[10];




        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 101);
            System.out.print(array[i] + " ");
        }






                int max = array[0];
      int position = 1;
       for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
               position = i + 1;
           }
       }

       System.out.println();
        System.out.println("chance: " + max + ", position: " + position);
        }
      }

