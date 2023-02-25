package base;

import enums.Circumstance;
import enums.TimeEnum;

public class Face {
    private String name;
    private String description;

    public Face(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void become(Dunno obj) {
        System.out.print(this.toString() + " у" + obj.toString() + " стали" + Circumstance.SADDER + ",");
    }

    public void drop(Tears obj) {
        System.out.print(", и " + obj.toString() + " закапали из их" + this.toString() + ".");
    }


    public String toString() {
        return description + " " + name;
    }
}
