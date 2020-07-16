package Step11_AnnotationsFieldInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Coach")
public class TennisCoach implements Coach {

    @Autowired
    private HappyFortuneService service;


    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice,because you are the Best";
    }
}
