package javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {

    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;
    private String emailAddress;

    private String team;

    @Override
    public String getDailyWorkout() {
        return "I am CricketCoach";
    }

    @Override
    public String getDailyFortune() {
        return "I am CricketCoach " + fortuneService.getFortune();
    }

//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//        System.out.println(fortuneService);
//    }

    //新编写的自己命名的方法，该方法符合注入方式
//    @Autowired
//    public void doSomething(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//        System.out.println("A normal method use @Autowired");
//        System.out.println(fortuneService);
//    }


    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
}
