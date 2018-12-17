package com.mix.patterns.gof.behavioral.observer;

public interface Observable {
    void addObserver(WeatherObserver observer);

    void removeObserver(WeatherObserver observer);

    void notifyObservers();
}
