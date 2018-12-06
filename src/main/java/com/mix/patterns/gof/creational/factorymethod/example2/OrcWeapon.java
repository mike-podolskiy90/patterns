package com.mix.patterns.gof.creational.factorymethod.example2;

public class OrcWeapon implements Weapon {
    private WeaponType weaponType;

    public OrcWeapon(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
