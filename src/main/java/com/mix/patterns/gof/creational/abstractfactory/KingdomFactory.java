package com.mix.patterns.gof.creational.abstractfactory;

public interface KingdomFactory {
    Castle createCastle();
    King createKing();
    Army createArmy();
}
