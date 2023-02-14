package com.hillel.nekrasov.home_works.works6;

import java.util.Scanner;

public class Mine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number1 = -1;
        int number2 = -1;
        int number3 = -1;
        int number4 = -1;
        int number5 = -1;
        int number6 = -1;
        int number7 = -1;
        int number8 = -1;
        int number9 = -1;
        int number10 = -1;



        System.out.print("Please enter TeamName1:");
        String TeamName1 = scanner.nextLine();


        System.out.println("Please enter points player 1: ");
        if (scanner.hasNextInt()) {
            number1 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter points player 2: ");
        if (scanner.hasNextInt()) {
            number2 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter points player 3: ");
        if (scanner.hasNextInt()) {
            number3 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter points player 4: ");
        if (scanner.hasNextInt()) {
            number4 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter points player 5: ");
        if (scanner.hasNextInt()) {
            number5 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        scanner.nextLine();
        System.out.print("Please enter TeamName2: ");
        String TeamName2 = scanner.nextLine();

        System.out.print("Please enter points player 1: ");
        if (scanner.hasNextInt()) {
            number6 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter points player 2: ");
        if (scanner.hasNextInt()) {
            number7 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter points player 3: ");
        if (scanner.hasNextInt()) {
            number8 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter points player 4: ");
        if (scanner.hasNextInt()) {
            number9 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        System.out.println("Please enter points player 5: ");
        if (scanner.hasNextInt()) {
            number10 = scanner.nextInt();
        } else {
            System.out.println("Wrong data! Restart program");
            System.exit(0);
        }
        int result1 = (number1 + number2 + number3 + number4 + number5) / 5;
        int result2 = (number6 + number7 + number8 + number9 + number10) / 5;


        if (result1 > result2) {
            System.out.println("Congratulations!  " + TeamName1 + "  набрала  " + result1 + "  points");
        } else if (result1 == result2) {
                System.out.println("Ничья!  " + TeamName1 + " и " + TeamName2 + "  набрали по  " + result1 + " points");
            } else {
                System.out.println("Congratulations!  " + TeamName2 + "  набрала  " + result2 + "  points");
            }
        }
    }




