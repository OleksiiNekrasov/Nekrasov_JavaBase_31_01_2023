package com.hillel.nekrasov.home_works.lessons2;

public class Burger {
    String pan;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String doubleMeat;

    public Burger(String pan, String meat, String cheese, String greens, String mayonnaise, String doubleMeat) {
        this.pan = pan;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;

    }

        public void  ordinary (){
            System.out.println("Burger ordinary: pan,  meat,  cheese,  greens,  mayonnaise");
               }

        public void diet (){
            System.out.println("Burger diet: pan,  meat,  cheese,  greens");
             }

        public void doubleMeat (){
            System.out.println("Burger double Meat: pan,  double meat,  cheese,  greens,  mayonnaise");
              }

    }

