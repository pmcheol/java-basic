package springinaction.chapter01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

@Import({SpringInActionConfiguration.class})
public class SpringInActionApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringInActionApplication.class);
        Knight knight = applicationContext.getBean(Knight.class);
        knight.talk();
    }
}
