package com.hillel.nekrasov.home_works.lessons2;

public class Burger {
 //   String pan;
 //   String meat;
 //   String cheese;
 //   String greens;
 //   String mayonnaise;
 //   String doubleMeat;


  String ordinary;


    String diet;
    String doubleMeat;
   public Burger(String ordinary) {
        this.ordinary = ordinary;
        System.out.println("pan,meat,cheese,greens,mayonnaise");
    }

    public static void BurgerMain(String[] args) {
        Burger ordinary = new Burger("обычный :pan,meat,cheese,greens,mayonnaise");
        System.out.println(ordinary);
     //   burger.ordinary = "pan,meat,cheese,greens,mayonnaise";
     //   burger.diet = "pan,meat,cheese,greens";
     //   burger.doubleMeat = "pan,meatMeat,mayonnaise,cheese,greens";
     //   System.out.println("ваш заказ: " + burger.ordinary);
     //   System.out.println("ваш заказ: " + burger.diet);
     //   System.out.println("ваш заказ: " + burger.doubleMeat);

    }

}
