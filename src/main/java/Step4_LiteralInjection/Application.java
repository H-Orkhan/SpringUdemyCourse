package Step4_LiteralInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step4\\ApplicationContext.xml");

        CricketCoach myCoach = context.getBean("myCoach", CricketCoach.class);

        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getFortune());

        System.out.println(myCoach.getTeamName());

        System.out.println(myCoach.getTeamEmail());


        context.close();
    }

}
