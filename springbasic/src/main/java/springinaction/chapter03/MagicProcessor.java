package springinaction.chapter03;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Conditional(ConditionChecker.class)
@Component
public class MagicProcessor implements InitializingBean {
    @Autowired
    @Cold
    @Creamy
    private Dessert dessert;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MagicProcessor READY!");
    }
}
