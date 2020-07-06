package ru.portretnyy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReactiveEngine implements Engine {
    private final int maxSpeed;
    private final int powerLimit;

    @Autowired
    public ReactiveEngine(@Value("1000") int maxSpeed, @Value("450") int powerLimit) {
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
