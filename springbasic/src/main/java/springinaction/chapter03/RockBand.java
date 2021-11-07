package springinaction.chapter03;

public class RockBand {

    private final String name;

    public RockBand(String name) {
        this.name = name;
    }

    public void echo() {
        System.out.println("name = " + name);
    }
}
