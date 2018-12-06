package com.mix.patterns.gof.creational.factorymethod.example2;

public class OrcBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        System.out.printf("Orc %s has been made\n", weaponType);
        return new OrcWeapon(weaponType);
    }
}
