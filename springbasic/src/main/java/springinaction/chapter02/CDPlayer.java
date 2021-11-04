package springinaction.chapter02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer {
    @Autowired
    private CompactDisc cd;

    @Override
    public void play() {
        System.out.println("PLAY");
        cd.play();
    }
}
