package springinaction.chapter02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CompactDiscPlayerConfiguration {
    @Bean
    public MediaPlayer mediaPlayer(CompactDisc cd) {
        return new CDPlayer(cd);
    }
}
