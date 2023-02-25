package base;

import enums.Circumstance;
import enums.TimeEnum;
import interfaces.DunnoEyes;

import java.util.Objects;

public class Dunno implements DunnoEyes {
    private final String name;
    private String description;

    public Dunno(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void stayAlone(Surrounding obj) {
        System.out.println(this.toString() + " остался один на" + obj.toString() + ".");
    }

    @Override
    public void watched(Group obj) {
        System.out.println(this.toString() + Circumstance.SADLY + " смотрел" + Circumstance.AFTER + obj.toString() + ",");
    }


    @Override
    public void lookAround(Surrounding obj) {
        System.out.print(Circumstance.THEN + " огляделся" + " по" + obj.toString() + ",");
    }

    public void search(Someone obj) {
        System.out.print(Circumstance.THOUGHT + obj.toString() + " искал.");
    }

    @Override
    public void notice(Surrounding obj) {
        System.out.print(" но " + TimeEnum.TIME + this.toString() + " увидел на " + obj.toString() + ",");
    }

    public void towards(Gunka obj) {
        System.out.println(" а" + this.toString() + " побежал " + Circumstance.TOWARDS + obj.toString() + ".");
    }

    public void become() {
        System.out.print(", ставшего " + this.toString() + ", а ");
    }

    @Override
    public void stare(Face obj) {
        System.out.println(this.toString() + " смотрел с " + obj.toString() + ".");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dunno dunno = (Dunno) o;
        return Objects.equals(name, dunno.name) && Objects.equals(description, dunno.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }

    public String toString() {
        return description + " " + name;
    }


}
