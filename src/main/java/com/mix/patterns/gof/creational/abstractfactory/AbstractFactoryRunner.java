package com.mix.patterns.gof.creational.abstractfactory;

public class AbstractFactoryRunner {

    public static void main(String[] args) {
        KingdomFactory elfKingdomFactory = new ElfKingdomFactory();
        Castle elfCastle = elfKingdomFactory.createCastle();
        King elfKing = elfKingdomFactory.createKing();
        Army elfArmy = elfKingdomFactory.createArmy();

        System.out.println(elfCastle.getDescription());
        System.out.println(elfKing.getDescription());
        System.out.println(elfArmy.getDescription());
    }
}
