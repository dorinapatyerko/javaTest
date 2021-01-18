package com.company;

public class Cat extends Animal implements Pet {
    // implements: interface érvényesítése. Ebben az esetben a Pet-ben megfogalmazott tételeket kötelező jelleggel overrideolni kell! Interface-ből bármennyit hozzá tudok kötni egy classhoz. Ebben az esetben vesszővel elválasztom őket egymástól.
    // extends: Polimorfizmus, öröklődés. A Cat az Animal un. kiterjesztése. Egymás után fűzhető pl.: Animal -> Mammal -> Cat -> HouseCat
    @Override // Felülírás annotációja (őstöl örökölt tulajdonság)
    public void makeSound(){
        System.out.println("Meow!");
    }

    @Override
    public void cuddle() {

    }

    @Override
    public void sit() {

    }

    @Override
    public void layDown() {

    }
}
