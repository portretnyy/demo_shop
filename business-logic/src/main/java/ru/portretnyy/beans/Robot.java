package ru.portretnyy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Robot {
    private final CentralComputer centralComputer;
    private final Engine engine;
    private final Arm leftArm;
    private final Arm rightArm;

    public Robot(CentralComputer centralComputer,
                 Engine engine,
                 Arm leftArm,
                 Arm rightArm) {
        this.centralComputer = centralComputer;
        this.engine = engine;
        this.leftArm = leftArm;
        this.rightArm = rightArm;
    }

    public CentralComputer getCentralComputer() {
        return centralComputer;
    }

    public Engine getEngine() {
        return engine;
    }

    public Arm getLeftArm() {
        return leftArm;
    }

    public Arm getRightArm() {
        return rightArm;
    }
}
