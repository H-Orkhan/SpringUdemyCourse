package Step10_AnnotationsSetterInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Coach")
public class TennisCoach implements Coach {

    private  HappyFortuneService service;

    //Instead of Setter method I can use any method
    @Autowired
    public void setService(HappyFortuneService service) {
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
