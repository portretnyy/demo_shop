package ru.portretnyy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ru.portretnyy.beans.*;


@Configuration
public class ApplicationConfiguration {

    @Bean
    public CentralComputer centralComputer() {
        return new CentralComputerImpl();
    }

    @Bean
    public Engine engine() {
        return new ReactiveEngine(900, 8000);
    }

    @Bean
    public Arm weaponArm() {
        return new WeaponArm();
    }

    @Bean
    public Arm repairArm() {
        return new RepairArm();
    }

    @Bean
    @Scope("prototype")
    public Robot robot() {
        return new Robot(
                centralComputer(),
                engine(),
                weaponArm(),
                repairArm()
        );
    }
}
