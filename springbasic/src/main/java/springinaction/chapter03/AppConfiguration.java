package springinaction.chapter03;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Properties;

@PropertySource({"classpath:prop.properties"})
@ComponentScan
@Configuration
public class AppConfiguration {
    @Bean
    public RockBand rockBand(@Value("#{ systemProperties }") Properties properties) {
        properties.list(System.out);
        return new RockBand(null);
    }
}
