package Step7_BeanLifeCycle;

public class FortuneService implements Fortune {

    @Override
    public String getFortune() {
        return "Have a lucky day bro";
    }
}
