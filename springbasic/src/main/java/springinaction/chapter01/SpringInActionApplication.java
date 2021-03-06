package springinaction.chapter01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringInActionApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringInActionConfiguration.class);
        Knight knight = applicationContext.getBean(Knight.class);
        knight.talk();

        UnitFinder unitFinder = applicationContext.getBean(UnitFinder.class);
        Unit user = unitFinder.getUser(1);
        System.out.println("user.getName() = " + user.getName());
    }
}
