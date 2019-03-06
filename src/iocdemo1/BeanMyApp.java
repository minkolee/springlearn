package iocdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanMyApp {
    public static void main(String[] args) {
        //创建容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope.xml");

        //先后获取两个被配置为单例的Bean
//        Coach coach1 = context.getBean("myCoach", Coach.class);
//        Coach coach2 = context.getBean("myCoach", Coach.class);
//
//        //检测是否相同
//        System.out.print("两个Bean是否相同: ");
//        System.out.println(coach1==coach2);
//        System.out.println("第一次获取的Bean是: " + coach1);
//        System.out.println("第二次获取的Bean是: " + coach2);
//
//        //先后获取两个被配置为prototype的Bean
//        FortuneService fortuneService1 = context.getBean("myFortuneService", HappyFortuneService.class);
//        FortuneService fortuneService2 = context.getBean("myFortuneService", HappyFortuneService.class);
//
//        //检测是否相同
//        System.out.print("两个Bean是否相同: ");
//        System.out.println(fortuneService1==fortuneService2);
//        System.out.println("第一次获取的Bean是: " + fortuneService1);
//        System.out.println("第二次获取的Bean是: " + fortuneService2);

        //获取Bean
        TrackCoach coach = context.getBean("myTrackCoach", TrackCoach.class);

        //关闭容器
        context.close();
    }
}
