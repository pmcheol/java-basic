package springinaction.chapter01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.PrintStream;

@Aspect
public class Minstrel {
    private final PrintStream printStream;

    public Minstrel(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Before(value = "execution(* springinaction.chapter01.Knight.talk())")
    public void singBefore() {
        printStream.println("go go go");
    }

    @After(value = "execution(* springinaction.chapter01.Knight.talk())")
    public void singAfter() {
        printStream.println("ok");
    }
}
