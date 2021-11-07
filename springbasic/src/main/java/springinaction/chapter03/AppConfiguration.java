package springinaction.chapter03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@PropertySource({"classpath:prop.properties"})
@ComponentScan
@Configuration
public class AppConfiguration {
    @Autowired
    private Environment environment;

    @Bean
    public RockBand rockBand() {
        return new RockBand(environment.getProperty("band.buzz.name"));
    }
}
