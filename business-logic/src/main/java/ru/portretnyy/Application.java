package ru.portretnyy;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.portretnyy.beans.Robot;

public class Application {
    public static void main(String[] args) {
        final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        final Robot robot = context.getBean("robot", Robot.class);
        final Robot anotherRobot = context.getBean("robot", Robot.class);
        assert (robot == anotherRobot);

        robot.getCentralComputer().analyze();
        System.out.println("robot.getEngine().maxSpeed() = " + robot.getEngine().maxSpeed());
        robot.getLeftArm().action();
        robot.getRightArm().action();
        System.out.println(context);
    }
}
