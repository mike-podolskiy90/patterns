package com.mix.patterns.gof.structural.flyweight.example2;

/**
 * if flyweights[key] exists
 *      return existing flyweight
 *  else
 *      create new flyweight
 *      add to pool of flyweights
 *      return new flyweight
 */
public class Runner {
    public static void main(String[] args) {
        PotionFactory factory = new PotionFactory();
        factory.createPotion(PotionType.INVISIBILITY).drink();
        factory.createPotion(PotionType.HEALING).drink();
        factory.createPotion(PotionType.INVISIBILITY).drink();
        factory.createPotion(PotionType.HOLY_WATER).drink();
        factory.createPotion(PotionType.HOLY_WATER).drink();
        factory.createPotion(PotionType.HEALING).drink();
    }
}
