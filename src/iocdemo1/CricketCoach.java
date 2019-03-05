package iocdemo1;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    // 定义好接受依赖对象的变量
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

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    //新的setter方法
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    //新的setter方法
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
