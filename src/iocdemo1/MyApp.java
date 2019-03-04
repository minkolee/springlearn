package iocdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
    public static void main(String[] args) {
        //创建容器
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //获取Bean
        Coach theCoach = context.getBean("myCoach", Coach.class);
        //尝试使用Bean
        System.out.println(theCoach.getDailyWorkout());
        //关闭容器
        context.close();
    }
}
