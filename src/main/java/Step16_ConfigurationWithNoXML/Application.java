package Step16_ConfigurationWithNoXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("thatCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getFortune());

        context.close();
    }
}
