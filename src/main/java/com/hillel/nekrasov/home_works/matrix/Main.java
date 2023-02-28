package com.hillel.nekrasov.home_works.matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        while (true){
        System.out.println("Please enter number N: ");
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            System.out.println("Please enter number M : ");
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
            break;
        } else {
            System.out.println("Wrong data! ");
            scanner.hasNextInt();
            System.out.println();
                        }
        }
        }

        int[][] a = new int[n][];
        int[][] a1 = new int[m][];
        System.out.println("MATRIX NxM ");
        for (int i = 0; i < a1.length; i++)
           a1[i] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = new int[m];
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) Math.round(Math.random() * 10);
                System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a1[i].length; j++) {
                    a1[i][j] = a[j][i];
                }
            }
            System.out.println("MATRIX MxN");
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a1[i].length; j++) {
                    System.out.print(a1[i][j] + " ");
                }
                System.out.println();
            }
        }
    }


