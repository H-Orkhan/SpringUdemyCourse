package Step1_InversionOfControl;

public class BaseballCoach implements Coach {

	@Override
    public String getDailyWorkout() {
        return "You must win with 90 score";
    }
}
