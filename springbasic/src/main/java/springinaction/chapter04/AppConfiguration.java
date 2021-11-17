package springinaction.chapter04;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AppConfiguration {
    @Bean
    public Performance performance() {
        return new Performance();
    }

    @Bean
    public Audience audience() {
        return new Audience();
    }
}
