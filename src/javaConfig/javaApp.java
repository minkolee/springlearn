package javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Coach swimCoach = context.getBean("swimCoach", SwimCoach.class);
        System.out.println(swimCoach.getDailyWorkout());
        System.out.println(swimCoach.getDailyFortune());
        context.close();
    }
}
