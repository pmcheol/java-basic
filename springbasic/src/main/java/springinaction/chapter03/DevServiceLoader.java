package springinaction.chapter03;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DevServiceLoader implements ServiceLoader {
    @Override
    public void load() {
        System.out.println("dev");
    }
}
