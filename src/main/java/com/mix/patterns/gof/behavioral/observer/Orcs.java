package com.mix.patterns.gof.behavioral.observer;

public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("Orcs were informed about changed weather: " + weatherType);
    }
}
