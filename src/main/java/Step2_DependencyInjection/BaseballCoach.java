package Step2_DependencyInjection;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "You must win with 90 score";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}
