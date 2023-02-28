package com.hillel.nekrasov.home_works.works9;

import java.util.Arrays;

public class Mine {
    public static void main(String[] args) {

        int[] array1 = new int[25];
        int sumAge1 = 0;
        int averageAge1 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);
            sumAge1 = sumAge1 + array1[i];
            averageAge1 = sumAge1 / 25;
        }

        System.out.println("Age 1 command rugby: " + Arrays.toString(array1));
        int[] array2 = new int[25];
        int sumAge2 = 0;
        int averageAge2 = 0;

        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) ((Math.random() * (40 - 18 + 1)) + 18);
            sumAge2 = (sumAge2 + array2[i]);
            averageAge2 = sumAge2 / 25;
        }

        System.out.println("Age 2 command rugby: " + Arrays.toString(array2));
        System.out.println();
        System.out.println("Average age 1 command rugby = " +averageAge1);
        System.out.println("Average age 2 command rugby = " +averageAge2);


    }
}



