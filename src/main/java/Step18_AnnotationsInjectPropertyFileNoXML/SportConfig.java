package Step18_AnnotationsInjectPropertyFileNoXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("Step18\\sport.properties")
public class SportConfig {

    //define Bean for fortuneService
    @Bean
    public FortuneService sadFortuneService () {
        return new SadFortuneService();
    }

    //define Bean for SwimCoach
    @Bean
    public Coach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }

}
