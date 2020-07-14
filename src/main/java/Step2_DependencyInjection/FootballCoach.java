package Step2_DependencyInjection;

public class FootballCoach implements Coach {

    private FortuneService fortuneService;

    public FootballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyWorkout() {
        return "You must win with 5-0 score";
    }

    public String getFortune() {
        return fortuneService.getFortune();
    }
}
