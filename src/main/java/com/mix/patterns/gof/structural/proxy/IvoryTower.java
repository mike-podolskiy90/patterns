package com.mix.patterns.gof.structural.proxy;

public class IvoryTower implements WizardTower {
    @Override
    public void enter(Wizard wizard) {
        System.out.printf("%s enters the tower\n", wizard);
    }
}
