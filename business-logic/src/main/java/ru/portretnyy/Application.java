package ru.portretnyy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.portretnyy.beans.Robot;

public class Application {
    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigApplicationContext("ru.portretnyy");
        final Robot bean = context.getBean(Robot.class);



        System.out.println();
        final Robot robot = context.getBean(Robot.class);
    }
}
