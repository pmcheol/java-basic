package springinaction.chapter03;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProdServiceLoader implements ServiceLoader {
    @Override
    public void load() {
        System.out.println("prod");
    }
}
