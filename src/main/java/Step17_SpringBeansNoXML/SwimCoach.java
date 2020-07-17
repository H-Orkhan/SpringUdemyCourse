package Step17_SpringBeansNoXML;

public class SwimCoach  implements Coach{

    private FortuneService service;

    public SwimCoach(FortuneService service) {
        this.service = service;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000m as a warm up";
    }

    @Override
    public String getFortune() {
        return service.getFortune();
    }
}
