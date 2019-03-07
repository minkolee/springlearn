package javaConfig;

import org.springframework.stereotype.Component;

@Component
public class JoyFortuneService implements FortuneService {
    public String getFortune() {
        return "Today is your lucky day for JoyFortuneService!";
    }
}
