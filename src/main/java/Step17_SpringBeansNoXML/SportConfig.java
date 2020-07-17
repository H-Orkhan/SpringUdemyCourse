package Step17_SpringBeansNoXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("Step17_ConfigurationWithNoXML")
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
