package Step15_AnnotationsBeanLifeCycle;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Step15\\AnnotationsBeanLifeCycle.xml");

        Coach alphaCoach = context.getBean("Coach", TennisCoach.class);

         Coach betaCoach = context.getBean("Coach", TennisCoach.class);


        context.close();
    }
}
