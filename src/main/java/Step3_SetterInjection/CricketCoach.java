package Step3_SetterInjection;

public class CricketCoach implements Coach{

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
}
