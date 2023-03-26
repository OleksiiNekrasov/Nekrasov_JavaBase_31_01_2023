package com.hillel.nekrasov.home_works.works18;




    public class ArrayUtil {
    //     private final int [][]array = new int[2][2];

       public static boolean isQuadratic(int[][] array) {
            for (int[] arr : array) {
                if (array.length == arr.length) {
                    System.out.println("It is array quadratic ");
                    return true;
                }

            }
           System.out.println("It is array No quadratic ");
            return false;
        }
    }










