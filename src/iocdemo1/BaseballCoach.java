package iocdemo1;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
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
