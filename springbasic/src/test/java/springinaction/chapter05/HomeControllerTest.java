package springinaction.chapter05;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeControllerTest {
    @Test
    public void foo() {
        HomeController controller = new HomeController();
        assertEquals(controller.home(), "home");
    }
}