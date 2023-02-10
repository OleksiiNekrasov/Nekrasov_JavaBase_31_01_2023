package com.hillel.nekrasov.home_works.works5;

public class Mine {
    public static void main(String[] args) {
        // За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
        //З кожного боку боролися 3 типи воїнів з такими показниками атаки:
        //Лі:
        //воїн - 13
        //лучник - 24
        //вершник - 46
        //
        //Мінь:
        //воїн - 9
        //лучник - 35
        //вершник - 12
        //Розрахувати: загальний показник атаки для обох династій, якщо відомо, що воїнів династії Лі кожного типу було 860, а кількість воїнів династії Мінь кожного типу в півтора рази більша.
        //Вивести в консоль значення загальної атаки кожної армії;
        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;
        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;
        int warriorTotalLi = 860;
        int warriorTotalMin = (int) (860 * 1.5);
        int totalAttackLi = (int) (warriorLi + archerLi + riderLi) * warriorTotalLi;
        int totalAttackMin = (int) (warriorMin + archerMin + riderMin) * warriorTotalMin;
        System.out.println("значення загальної атаки Li : " + totalAttackLi);
        System.out.println("значення загальної атаки Min : " + totalAttackMin);

    }
}
