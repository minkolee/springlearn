package annodemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annoContext.xml");


//        System.out.println(context.getBean("cricketCoach", CricketCoach.class).getDailyFortune());
//        System.out.println(context.getBean("cricketCoach", CricketCoach.class).getEmailAddress());
//        System.out.println(context.getBean("cricketCoach", CricketCoach.class).getTeam());
        System.out.println(context.getBean("baseballCoach", BaseballCoach.class).getDailyFortune());
        System.out.println(context.getBean("baseballCoach", BaseballCoach.class).getEmail());

        context.close();
    }
}
