package com.mix.patterns.gof.creational.abstractfactory;

public class OrcArmy implements Army {
    static final String DESCRIPTION = "This is the Orc army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
