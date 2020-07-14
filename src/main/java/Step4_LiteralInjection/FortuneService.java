package Step4_LiteralInjection;

public class FortuneService implements Fortune {

    @Override
    public String getFortune() {
        return "Have a lucky day bro";
    }
}
