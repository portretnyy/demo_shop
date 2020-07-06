package ru.portretnyy.beans;

public class CentralComputerImpl implements CentralComputer {
    public void analyze() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
