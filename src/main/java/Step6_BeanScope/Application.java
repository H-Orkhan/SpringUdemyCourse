package Step6_BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Step6\\BeanLifeCycle_ApplicationContext.xml");

        Coach myCoach = context.getBean("myCoach", CricketCoach.class);

        Coach yourCoach = context.getBean("myCoach",CricketCoach.class);

        boolean result = (myCoach==yourCoach);

        System.out.println(result);

        System.out.println("Memory location for yourCoach is" + yourCoach);

        System.out.println("Memory location for myCoach is" + myCoach);
        context.close();
    }

}
