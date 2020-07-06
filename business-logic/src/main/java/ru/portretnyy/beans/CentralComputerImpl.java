package ru.portretnyy.beans;

import org.springframework.stereotype.Component;

@Component
public class CentralComputerImpl implements CentralComputer {
    public void analyze() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
