package iocdemo1;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
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

    public void doMyStartupStuff() {
        System.out.println("TrackCoach: inside init-method");
    }

    public void doMyCleanupStuff() {
        System.out.println("TrackCoach: inside destroy-method");
    }
}
