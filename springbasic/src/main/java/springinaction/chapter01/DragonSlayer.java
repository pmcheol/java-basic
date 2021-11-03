package springinaction.chapter01;

public class DragonSlayer implements Knight {
    private Quest quest;

    public DragonSlayer(Quest quest) {
        this.quest = quest;
    }

    @Override
    public void talk() {
        System.out.println(quest.getDesc());
    }
}
