package com.mix.patterns.gof.structural.adapter;

import com.mix.patterns.gof.structural.adapter.Chief;
import com.mix.patterns.gof.structural.adapter.example1.ChiefAdapterInheritance;
import com.mix.patterns.gof.structural.adapter.example2.ChiefAdapterComposition;

public class AdapterRunner {

    public static void eat(Object dish, Object chief) {
        System.out.printf("Dish %2$s cooked by %1$s has been eaten\n", chief, dish);
    }

    public static void main(String[] args) {
        Chief chief1 = new ChiefAdapterInheritance();
        Chief chief2 = new ChiefAdapterComposition();
        Object dish1 = chief1.makeBreakfast();
        Object dish2 = chief2.makeBreakfast();
        eat(dish1, chief1);
        eat(dish2, chief2);

        dish1 = chief1.makeLunch();
        dish2 = chief2.makeLunch();
        eat(dish1, chief1);
        eat(dish2, chief2);

        dish1 = chief1.makeDinner();
        dish2 = chief2.makeDinner();
        eat(dish1, chief1);
        eat(dish2, chief2);
    }
}
