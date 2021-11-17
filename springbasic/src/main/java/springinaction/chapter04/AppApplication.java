package springinaction.chapter04;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfiguration.class);

        Performance performance = applicationContext.getBean(Performance.class);
        performance.perform();

        performance.play(1);
        performance.play(2);
        performance.play(3);
        performance.play(2);

        ((Encoreable) performance).encore();
    }
}
