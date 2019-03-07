package javaConfig;


//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    @Bean
    public FortuneService happyFortuneService() {
        return new HappyFortuneService();
    }

    @Bean
    public Coach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }
}
