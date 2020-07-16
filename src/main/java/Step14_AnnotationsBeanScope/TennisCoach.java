package Step14_AnnotationsBeanScope;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Coach")
@Scope("prototype")
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService service;

    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice,because you are the Best";
    }
}
