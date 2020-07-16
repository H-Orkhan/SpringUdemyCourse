package Step12_AnnotationsQualifiers;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Your lucky day bro";
    }
}
