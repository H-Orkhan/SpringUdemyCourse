package Step16_ConfigurationWithNoXML;

import org.springframework.stereotype.Component;

@Component("thatCoach")
//all in () is BeanID
//if () is Empty,BeanID will be name of class,but first letter will be in LowerCase not UpperCase!!!
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice,because you are the Best";
    }
}
