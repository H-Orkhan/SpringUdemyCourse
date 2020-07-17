package Step15_AnnotationsBeanLifeCycle;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("Coach")
@Scope("singleton")
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

    @PostConstruct
    public void startUp() {
        System.out.println("Bean was been created");
    }

    @PreDestroy
    public void shutDown() {
        System.out.println("Bean was been destroyed");
    }
}
