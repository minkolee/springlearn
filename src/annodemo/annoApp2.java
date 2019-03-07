package annodemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annoApp2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annoContext.xml");
        CricketCoach cricketCoach1 = context.getBean("cricketCoach", CricketCoach.class);
        CricketCoach cricketCoach2 = context.getBean("cricketCoach", CricketCoach.class);
        System.out.println(cricketCoach1==cricketCoach2);
        System.out.println(cricketCoach1 + " | " + cricketCoach2);

        BaseballCoach baseballCoach1 = context.getBean("baseballCoach", BaseballCoach.class);
        BaseballCoach baseballCoach2 = context.getBean("baseballCoach", BaseballCoach.class);
        System.out.println(baseballCoach1 == baseballCoach2);
        System.out.println(baseballCoach1 + " | " + baseballCoach2);
    }
}
