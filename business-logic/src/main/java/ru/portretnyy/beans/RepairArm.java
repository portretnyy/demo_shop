package ru.portretnyy.beans;

import org.springframework.stereotype.Component;

public class RepairArm implements Arm {
    public void action() {
        System.out.println("repairs robot itself");
    }
}
