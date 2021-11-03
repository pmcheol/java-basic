package springinaction.chapter01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class SpringInActionConfiguration {
    @Bean
    public Quest quest() {
        return new DragonQuest();
    }

    @Bean
    public Knight knight() {
        return new DragonSlayer(quest());
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel(System.out);
    }
}
