package com.mix.patterns.gof.creational.factorymethod.example2;

public class FactoryMethodRunner2 {
    public static void main(String[] args) {
        Blacksmith elfBlacksmith = new ElfBlacksmith();
        elfBlacksmith.manufactureWeapon(WeaponType.SPEAR);
        elfBlacksmith.manufactureWeapon(WeaponType.AXE);
    }
}
