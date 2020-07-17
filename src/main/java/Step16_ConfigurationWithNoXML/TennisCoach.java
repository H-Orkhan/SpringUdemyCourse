package Step16_ConfigurationWithNoXML;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thatCoach")
//all in () is BeanID
//if () is Empty,BeanID will be name of class,but first letter will be in LowerCase not UpperCase!!!
public class TennisCoach implements Coach {

    @Autowired
    private FortuneService service;

    @Override
    public String getFortune () {
       return service.getFortune();
    }
    @Override
    public String getDailyWorkout() {
        return "Practice,because you are the Best";
    }
}
