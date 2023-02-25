package base;

public class Shadow extends PhysicalPhenomena {
    public Shadow(String name) {
        super(name);
    }

    @Override
    public void arise() {
        System.out.print(" в появившейся ");
    }

    @Override
    public void blowAway(Group obj) {

    }

}
