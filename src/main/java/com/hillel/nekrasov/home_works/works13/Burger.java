package com.hillel.nekrasov.home_works.works13;

public class Burger {
    String pan;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String meatMeat;

     void ordinary() {
        this.pan = pan;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        if(ordinary()) {
            System.out.println("Ordinary Burger: pan, meat, cheese, greens, mayonnaise");
        }
    }

    public void Diet(String pan, String meat, String cheese, String greens) {
        this.pan = pan;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Diet Burger: pan, meat, cheese, greens");

    }

    public void DoubleMeat(String pan, String cheese, String greens, String mayonnaise, String meatMeat) {
        this.pan = pan;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
            this.meatMeat = meatMeat;
        System.out.println("Double Meat Burger: pan, double meat, cheese, greens, mayonnaise");
    }

    public void Diet() {
    }

    public void DoubleMeat() {
    }
}

