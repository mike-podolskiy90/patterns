package com.mix.patterns.gof.creational.factorymethod.example2;

public class ElfBlacksmith implements Blacksmith {
    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        System.out.printf("Elf %s has been made\n", weaponType);
        return new ElfWeapon(weaponType);
    }
}
