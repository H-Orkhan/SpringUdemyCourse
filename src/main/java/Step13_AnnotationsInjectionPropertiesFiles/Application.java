package Step13_AnnotationsInjectionPropertiesFiles;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Step13\\AnnotationsInjectionPropertiesFiles.xml");

        TennisCoach coach = context.getBean("Coach", TennisCoach.class);

        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        System.out.println(coach.getTeamName());

        System.out.println(coach.getTeamEmail());

        context.close();
    }
}
