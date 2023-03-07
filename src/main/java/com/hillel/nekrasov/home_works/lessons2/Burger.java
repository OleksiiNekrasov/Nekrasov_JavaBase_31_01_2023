package com.hillel.nekrasov.home_works.lessons2;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String doubleMeat;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String doubleMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.doubleMeat = doubleMeat;

    }

        public void  ordinary (){
            System.out.println("Burger ordinary: bun,  meat,  cheese,  greens,  mayonnaise");
               }

        public void diet (){
            System.out.println("Burger diet: bun,  meat,  cheese,  greens");
             }

        public void doubleMeat (){
            System.out.println("Burger double Meat: bun,  double meat,  cheese,  greens,  mayonnaise");
              }

    }

