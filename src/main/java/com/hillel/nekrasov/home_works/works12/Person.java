package com.hillel.nekrasov.home_works.works12;


public class Person {
    public static void main (String[] args) {
        personInfo("Will ", "Smith", "New York", "2936729462846");
        personInfo("Jackie ", "Chan", "Shanghai", "12312412412");
        personInfo("Sherlock ", "Holmes", "London", "37742123513");

    }

        static void personInfo(String name,String surName, String city, String telephone){

        System.out.println("Зателефонувати громадянинові " + name + surName + " з міста " + city + " можна за номером " + telephone);


        }

    }


