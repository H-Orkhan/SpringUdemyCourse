package Step2_DependencyInjection;

public class FortuneService implements Fortune{

    @Override
    public String getFortune() {
        return "Have a lucky day bro";
    }
}
