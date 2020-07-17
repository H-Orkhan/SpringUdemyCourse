package Step17_SpringBeansNoXML;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "I am so sad today";
    }
}
