package springinaction.chapter01;

import java.io.PrintStream;

public class Minstrel {
    private PrintStream printStream;

    public void singBefore() {
        printStream.println("go go go");
    }

    public void singAfter() {
        printStream.println("ok");
    }
}
