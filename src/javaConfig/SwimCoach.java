package javaConfig;

public class SwimCoach implements Coach {

    public FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "This is SwimCoach work";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
