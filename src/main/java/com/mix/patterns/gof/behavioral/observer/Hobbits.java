package com.mix.patterns.gof.behavioral.observer;

public class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherType weatherType) {
        System.out.println("Hobbits were informed about changed weather: " + weatherType);
    }
}
