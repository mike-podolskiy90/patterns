package com.mix.patterns.gof.structural.decorator;

public class DecoratorRunner {

    public static void main(String[] args) {
        SimpleTroll troll = new SimpleTroll();
        troll.attack();
        troll.fleeBattle();

        ClubbedTroll clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
    }
}
