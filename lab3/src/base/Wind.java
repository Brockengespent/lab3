package base;

public class Wind extends PhysicalPhenomena {
    public Wind(String name) {
        super(name);
    }

    @Override
    public void arise() {

    }
    @Override
    public void blowAway(Group obj) {
        System.out.println(obj.toString() + " будто унес " + this.toString() + ".");
    }

}
