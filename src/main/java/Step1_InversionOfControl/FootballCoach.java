package Step1_InversionOfControl;

public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "You must win with 5-0 score";
    }
}
