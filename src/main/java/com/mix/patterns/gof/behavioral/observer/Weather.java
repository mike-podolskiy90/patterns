package com.mix.patterns.gof.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Weather implements Observable {
    private WeatherType currentWeather;
    private List<WeatherObserver> observers = new ArrayList<>();

    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void timePasses() {
        System.out.println("Time passed");
        currentWeather = WeatherType.VALUES[new Random().nextInt(4)];
        System.out.println("Weather has changed to: " + currentWeather);
        notifyObservers();
    }

    public void notifyObservers() {
        observers.forEach(weatherObserver -> weatherObserver.update(currentWeather));
    }
}
