package Step8_AnnotationsBeginning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Step8\\AnnotationsBeginning.xml");

        Coach coach = context.getBean("thatCoach",Coach.class);

        System.out.println(coach.getDailyWorkout());

        context.close();
    }
}
