package springinaction.chapter02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompactDiscConfiguration {
    @Bean
    public CompactDisc compactDisc() {
        return new SgtPeppers();
    }
}
