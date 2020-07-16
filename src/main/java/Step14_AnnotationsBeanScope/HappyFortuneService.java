package Step14_AnnotationsBeanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Your lucky day bro";
    }
}
