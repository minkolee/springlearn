package annodemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired

    public TrackCoach(@Qualifier("joyFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "I am TrackCoach";
    }

    @Override
    public String getDailyFortune() {
        return "I am TrackCoach " + fortuneService.getFortune();
    }
}
