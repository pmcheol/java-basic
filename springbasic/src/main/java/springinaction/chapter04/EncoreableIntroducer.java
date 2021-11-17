package springinaction.chapter04;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class EncoreableIntroducer {
    @DeclareParents(
            value = "springinaction.chapter04.Performance",
            defaultImpl = EncoreableDefault.class)
    public static Encoreable encoreable;
}
