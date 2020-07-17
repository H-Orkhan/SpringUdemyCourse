package Step18_AnnotationsInjectPropertyFileNoXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getTeamEmail());

        System.out.println(coach.getTeamName());

        context.close();
    }
}
