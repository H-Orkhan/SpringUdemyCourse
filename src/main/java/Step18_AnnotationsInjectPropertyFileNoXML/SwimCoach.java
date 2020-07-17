package Step18_AnnotationsInjectPropertyFileNoXML;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach  implements Coach {

    @Value("${foo.name}")
    private String teamName;

    @Value("${foo.email}")
    private String teamEmail;

    private FortuneService service;

    public SwimCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a warm up";
    }

    @Override
    public String getFortune() {
        return service.getFortune();
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamEmail() {
        return teamEmail;
    }
}
