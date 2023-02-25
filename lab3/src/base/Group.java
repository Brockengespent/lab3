package base;

import enums.Circumstance;
import interfaces.StayAbility;

import java.util.Objects;

public class Group implements StayAbility {
    private String name;
    private String description;

    public Group(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void open(Surrounding obj) {
        System.out.print(this.toString() + " открыли" + obj.toString() + " и");
    }

    @Override
    public void stayLong() {
        System.out.print("Так" + this.toString() + Circumstance.LENGTHY + " стояли, ");
    }

    public void head(Surrounding obj) {
        System.out.print(" направились к " + obj.toString() + ",");
    }


    public void notCollide(Face obj) {
        System.out.print(this.toString() + Circumstance.HARDLY + "не столкнулись" + obj.toString());
    }

    @Override
    public void stop(Surrounding obj) {
        System.out.print(" и остановились " + Circumstance.INTHEMIDDLE + obj.toString() + ". ");
    }


    public void hug() {
        System.out.print(this.toString() + Circumstance.THEN + Circumstance.TIGHT + "обнялись");
    }


    public void contemplate() {
        System.out.print(" разглядывали друг друга, ");
    }

    public void silence() {
        System.out.print("и от волнения не могли сказать ни одного слова.");
    }

    public String toString() {
        return description + " " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return Objects.equals(name, group.name) && Objects.equals(description, group.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
