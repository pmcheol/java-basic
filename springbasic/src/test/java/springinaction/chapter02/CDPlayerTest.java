package springinaction.chapter02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})
public class CDPlayerTest {
    @Autowired
    private CompactDisc cd;
    @Autowired
    private MediaPlayer player;

    @Test
    public void foo() {
        player.play();
    }
}
