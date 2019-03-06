package annodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach() {
    }

    @Autowired
    public BaseballCoach(@Qualifier("joyFortuneService") FortuneService fortuneService) {
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
}
