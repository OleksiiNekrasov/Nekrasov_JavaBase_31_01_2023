package com.hillel.nekrasov.home_works.works2;

public class Main {
    public static void main(String[] args) {
        int lat1 = 28;
        int lat2 = 5;
        float lat3 = 5.031_6F;
        int long1 = 16;
        int long2 = 44;
        float long3 = 13.603_2F;
        char grad = '\u00B0';

        System.out.println("My coordinates:");
        System.out.println("DMS Lat: "+ lat1 + grad +" "+ lat2 +"' "+lat3+"'' N");
        System.out.println("DMS Long: "+long1 + grad +" "+ long2 +"' "+long3+"'' W");

    }
}
