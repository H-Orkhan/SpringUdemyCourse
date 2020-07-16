package Step12_AnnotationsQualifiers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Coach")
public class TennisCoach implements Coach {

    //We use Qualifier when we have multiple implementation of our Interface
    @Autowired
    @Qualifier("happyFortuneService")
    private FortuneService service;

//    //When I want to use Qualifier in constructor,I must do it this case
//    @Autowired
//    public TennisCoach(@Qualifier("happyFortuneService") FortuneService service) {
//        this.service = service;
//    }




    @Override
    public String getDailyFortune() {
        return service.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Practice,because you are the Best";
    }
}
