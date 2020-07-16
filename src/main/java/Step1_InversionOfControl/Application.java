package Step1_InversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

        //Create ApplicationContext (Spring Container)
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Step1\\ApplicationContext.xml");

        //Get Bean
        Coach myCoach = context.getBean("myCoach", Coach.class);

        System.out.println(myCoach.getDailyWorkout());

        //Close ApplicationContext (Spring Container)
        context.close();
    }

}
