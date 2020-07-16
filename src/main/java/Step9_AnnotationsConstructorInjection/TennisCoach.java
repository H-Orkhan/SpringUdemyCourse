package Step9_AnnotationsConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Coach")
public class TennisCoach implements Coach {

    private final HappyFortuneService service;

    @Autowired
    //As of Spring Framework 4.3, an @Autowired annotation on such a constructor
    //is no longer necessary if the target bean only defines one constructor to begin with.
    public TennisCoach(HappyFortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice,because you are the Best";
    }
}
