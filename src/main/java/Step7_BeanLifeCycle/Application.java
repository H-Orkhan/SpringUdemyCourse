package Step7_BeanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Step7\\BeanLifeCycle_ApplicationContext.xml");

        CricketCoach myCoach = context.getBean("myCoach", CricketCoach.class);

        System.out.println(myCoach.getDailyWorkout());

        System.out.println("myCoach and CricketCoach class now are equals? :"
                + myCoach.equals(new CricketCoach()));
        context.close();

    }
}
