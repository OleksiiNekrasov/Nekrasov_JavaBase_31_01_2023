package com.hillel.nekrasov.home_works.works10;

import java.util.Arrays;

public class Mine {
    public static void main(String[] args) {

        int[] array = new int[7];


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));


        int[] array1 = new int[7];

        for (
                int i = 0;
                i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 11);
        }
        Arrays.sort(array1);


        System.out.println(Arrays.toString(array1));
        int counter = 0;
        int position;
        for (int i = 1; i < array.length; i++) {

            if (array[i] == array1[i]) {
                counter ++;
                position = i + 1;
                System.out.println();
                System.out.println("Number: "  + (array[i]));
                System.out.println("position: "  + position);
            }

        }

        System.out.println();
        System.out.println("counter: "  + counter);
    }
}
