package ru.portretnyy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class ReactiveEngine implements Engine {
    private final int maxSpeed;
    private final int powerLimit;


    public ReactiveEngine(int maxSpeed, int powerLimit) {
        this.maxSpeed = maxSpeed;
        this.powerLimit = powerLimit;
    }

    public int maxSpeed() {
        return maxSpeed;
    }

    public int powerLimit() {
        return powerLimit;
    }
}
