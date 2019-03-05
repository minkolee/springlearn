package iocdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        //创建容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Coach Bean
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
        //使用Bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getTeam());
        System.out.println(theCoach.getEmailAddress());

        //获取FortuneService Bean
        FortuneService fortuneService = context.getBean("myFortuneService", FortuneService.class);
        System.out.println(fortuneService.getFortune());

        //关闭容器
        context.close();
    }
}
