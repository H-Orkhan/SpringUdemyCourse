package Step8_AnnotationsBeginning;

import org.springframework.stereotype.Component;

@Component("thatCoach") //all in () is BeanID
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice,because you are the Best";
    }
}
