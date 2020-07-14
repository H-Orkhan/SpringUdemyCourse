package Step2_DependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Step2\\ApplicationContext.xml");

        Coach myCoach = context.getBean("myCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());

        System.out.println(myCoach.getFortune());

        context.close();
    }

}
