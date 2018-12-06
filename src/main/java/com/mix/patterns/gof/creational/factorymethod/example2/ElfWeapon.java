package com.mix.patterns.gof.creational.factorymethod.example2;

public class ElfWeapon implements Weapon {
    private WeaponType weaponType;

    public ElfWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
