package springinaction.chapter03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        ServiceLoader serviceLoader = applicationContext.getBean(ServiceLoader.class);
        serviceLoader.load();

        RockBand rockBand = applicationContext.getBean(RockBand.class);
        rockBand.echo();
    }
}
