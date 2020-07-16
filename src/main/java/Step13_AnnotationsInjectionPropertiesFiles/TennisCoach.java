package Step13_AnnotationsInjectionPropertiesFiles;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Coach")
public class TennisCoach implements Coach {

    @Value("${foo.name}")
    private String teamName;

    @Value("${foo.email}")
    private String teamEmail;

    public String getTeamName() {
        return teamName;
    }

    public String getTeamEmail() {
        return teamEmail;
    }

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
