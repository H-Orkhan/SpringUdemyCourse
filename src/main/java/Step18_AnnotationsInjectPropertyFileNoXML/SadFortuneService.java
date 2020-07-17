package Step18_AnnotationsInjectPropertyFileNoXML;

public class SadFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "I am so sad today";
    }
}
