package base;

public abstract class PhysicalPhenomena {
    private String name;


    public PhysicalPhenomena(String name) {
        this.name = name;
    }

    public abstract void arise();
    public abstract void blowAway(Group obj);

    public String toString() {
        return name;
    }
}
