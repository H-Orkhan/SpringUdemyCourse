package Step5_PropertiesInjection;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String teamName;
    private String teamEmail;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamEmail() {
        return teamEmail;
    }

    public void setTeamEmail(String teamEmail) {
        this.teamEmail = teamEmail;
    }

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
