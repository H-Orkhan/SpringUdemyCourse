package Step17_SpringBeansNoXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach coach = context.getBean("swimCoach", Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
