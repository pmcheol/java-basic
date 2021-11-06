package springinaction.chapter03;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(ConditionChecker.class)
@Component
public class MagicProcessor implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MagicProcessor READY!");
    }
}
