package com.hillel.nekrasov.home_works.works16;

class IPhones implements Smartphones, IOS {

    public void call() {

        System.out.println("Calling from IPhone");

    }

    public void sms() {

        System.out.println("Sending SMS from IPhone");

    }

    public void internet() {

        System.out.println("Browsing internet from IPhone");

    }

    public void icloud() {

       System.out.println("Using icloud from iPhone and based on IOS system");
    }

}

