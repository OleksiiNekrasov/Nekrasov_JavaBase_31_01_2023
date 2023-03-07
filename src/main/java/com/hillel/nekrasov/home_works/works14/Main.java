package com.hillel.nekrasov.home_works.works14;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthday1 = LocalDate.of(1982, 1, 31);

        FitnessUser user1 = new FitnessUser("Anastasiia", birthday1, "a41@example.com", "123456", "Doe", 80, 120, 10000);

        LocalDate birthday2 = LocalDate.of(1998, 7, 26);

        FitnessUser user2 = new FitnessUser("Alex", birthday2, "al33@example.com", "654321", "Doe", 60, 110, 8000);

        user1.printAccountInfo();

        user2.printAccountInfo();

        user1.setSurname("Pedro");

        user1.setWeight(75);

        user1.setPressure(120);

        user1.setSteps(11000);

        user2.setSurname("Diana");

        user2.setWeight(65);

        user2.setPressure(118);

        user2.setSteps(10000);

        user1.printAccountInfo();

        user2.printAccountInfo();

    }


}

