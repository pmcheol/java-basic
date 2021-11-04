package springinaction.chapter02;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {
    @Override
    public void play() {
        System.out.println("It was twenty years ago today");
    }
}
