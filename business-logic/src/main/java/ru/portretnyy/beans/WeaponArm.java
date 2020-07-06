package ru.portretnyy.beans;

import org.springframework.stereotype.Component;

@Component
public class WeaponArm implements Arm {
    public void action() {
        System.out.println("kill all enemies in sight");
    }
}
