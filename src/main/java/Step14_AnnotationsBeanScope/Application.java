package Step14_AnnotationsBeanScope;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("Step14\\AnnotationsBeanScope.xml");

        Coach alphaCoach = context.getBean("Coach", TennisCoach.class);

         Coach betaCoach = context.getBean("Coach", TennisCoach.class);

        System.out.println("They are same? " + alphaCoach.equals(betaCoach));

        //if Scope is singleton they will be same
        //if is prototype they will be different
        context.close();
    }
}
