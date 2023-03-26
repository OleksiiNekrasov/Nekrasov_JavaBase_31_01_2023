package com.hillel.nekrasov.home_works.works18;

public class Average {

        public static int SumAverage(int[] array) {

            if (array == null) {

                System.out.println("Wrong data");
                return 0;
            }

            if (array.length == 0) {
                System.out.println("Wrong data");

            }


            double average = 0;
            if (array.length > 0) {
                double sum = 0;
                for (int i : array) {
                    sum += i;
                }
                average = sum / array.length;
            }
            System.out.println("среднее арифметическое чисел равно: " + average);


            return 0;

        }

    }


