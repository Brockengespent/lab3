package base;

import enums.Circumstance;
import enums.TimeEnum;

public class Surrounding {
    private final String name;
    private String description;

    public Surrounding(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Surrounding(String name) {
        this.name = name;
        this.description = "";
    }

    public void empty() {
        System.out.print(" который пустовал " + TimeEnum.DAYS + ".");
    }

    public void itWas() {
        System.out.println(" На" + this.toString() + " было " + Circumstance.REALLY + " пусто.");
    }

    public String toString() {
        return description + " " + name;
    }


}
