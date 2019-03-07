package javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    private String email;

    public BaseballCoach() {
    }

    @Autowired
    public BaseballCoach(@Qualifier("joyFortuneService") FortuneService fortuneService) {
        System.out.println("This is auto-wired constructor.");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "I am BaseballCoach";
    }

    @Override
    public String getDailyFortune() {
        return "I am BaseballCoach " + fortuneService.getFortune();
    }

    @PostConstruct
    public void myInitMethod() {
        System.out.println("This is my init-method");
        email = "lee0709@vip.sina.com";
    }

    @PreDestroy
    public void myDestroyMethod() {
        System.out.println("This is my destroy-method");
    }

    public String getEmail() {
        return email;
    }
}
