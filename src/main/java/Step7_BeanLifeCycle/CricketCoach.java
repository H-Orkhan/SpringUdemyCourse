package Step7_BeanLifeCycle;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Have a 15 Score point";
    }

    @Override
    public String getFortune() {
        return "Have a good and lucky day";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void start () {
        System.out.println("Bean has been started");
    }

    public void finish () {
        System.out.println("Bean has been finished");
    }
}
