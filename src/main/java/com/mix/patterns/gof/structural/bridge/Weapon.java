package com.mix.patterns.gof.structural.bridge;

public interface Weapon {
    void wield();
    void swing();
    void unwield();
    Enchantment getEnchantment();
}
