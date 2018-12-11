package com.mix.patterns.gof.structural.proxy;

public class ProxyRunner {

    public static void main(String[] args) {
        WizardTower tower = new SecuredWizardTower(new IvoryTower());

        tower.enter(new Wizard("Red wizard"));
        tower.enter(new Wizard("White wizard"));
        tower.enter(new Wizard("Black wizard"));
        tower.enter(new Wizard("Green wizard"));
        tower.enter(new Wizard("Brown wizard"));
    }
}
