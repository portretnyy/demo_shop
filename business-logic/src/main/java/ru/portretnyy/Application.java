package ru.portretnyy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext("ru.portretnyy");

        System.out.println();
    }
}
