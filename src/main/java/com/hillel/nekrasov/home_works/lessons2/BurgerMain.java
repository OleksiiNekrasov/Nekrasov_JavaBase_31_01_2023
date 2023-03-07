package com.hillel.nekrasov.home_works.lessons2;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger("bun", "meat", "cheese", "greens", "mayonnaise", "doubleMeat");
        System.out.println();
        burger.ordinary();
        burger.diet();
        burger.doubleMeat();
    }
}

