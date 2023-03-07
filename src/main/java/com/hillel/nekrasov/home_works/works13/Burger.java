package com.hillel.nekrasov.home_works.works13;




class burger {

    private boolean bun;

    private boolean meat;

    private boolean cheese;

    private boolean lettuce;

    private boolean mayonnaise;

    public burger() {

        this.bun = true;

        this.meat = true;

        this.cheese = true;

        this.lettuce = true;

        this.mayonnaise = true;

        System.out.println("Обычный бургер : булочка, мясо, сыр, зелень, майонез");

    }

    public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce) {

        this.bun = bun;

        this.meat = meat;

        this.cheese = cheese;

        this.lettuce = lettuce;

        this.mayonnaise = false;

        System.out.println("Диетический бургер : булочка, мясо, сыр, зелень, без майонеза");

    }

    public burger(boolean bun, boolean meat, boolean cheese, boolean lettuce, boolean mayonnaise) {

        this.bun = bun;

        this.meat = meat;

        this.cheese = cheese;

        this.lettuce = lettuce;

        this.mayonnaise = mayonnaise;



        System.out.println("Бургер с двойным мясом : булочка, два куска мяса, сыр, зелень, майонез");

    }

}



