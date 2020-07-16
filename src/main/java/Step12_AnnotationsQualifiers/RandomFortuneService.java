package Step12_AnnotationsQualifiers;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return null;
    }
}
