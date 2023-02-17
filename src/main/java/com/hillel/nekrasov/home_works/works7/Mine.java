package com.hillel.nekrasov.home_works.works7;

import java.util.Scanner;

import static java.lang.System.*;

public class Mine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int random = (int) (Math.random() * 11);

        out.println("enter integer 0-10 =");
        int num1 = scanner.nextInt();

           if (num1 > random) {
               out.println("Your number " + num1 + " is greater than the computer guessed");
           }
        if (num1 == random) {
            out.println("Your number is right! =  " + num1 + " number is computer =" + random);
        }
        if (num1 < random) {
            out.println("Your number " + num1 + " is less than the computer guessed");
        }

        out.println("enter integer 0-10 =");
        int num2 = scanner.nextInt();

        if (num2 > random) {
            out.println("Your number " + num2 + " is greater than the computer guessed");
        }
        if (num2 == random) {
            out.println("Your number is right! =  " + num2 + " number is computer =" + random);
        }
            if (num2 < random) { out.println("Your number " + num2 + " is less than the computer guessed  ");
    }
        out.println("enter integer 0-10 =");
        int num3 = scanner.nextInt();
        if (num3 > random) {
            out.println("Your number " + num3 + "is greater than the computer guessed  ");
        }
            if (num3 == random) {
                out.println("Your number is right! =  " + num3 + " number is computer =" + random);
            }

            if (num3 < random) { out.println("Your number " + num3 + " is less than the computer guessed  ");
        }
        System.out.println("Computer number is = " + random);
        }
    }




