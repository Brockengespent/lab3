package base;

import enums.Circumstance;

import java.util.Objects;

public class Gunka {
    private final String name;


    public Gunka(String name) {
        this.name = name;

    }

    public void screech() {
        System.out.print(this.toString() + " взвизгнул " + Circumstance.WITHJOY + " и ");
    }

    public void rush(Dunno obj) {
        System.out.print(" бросился к" + obj.toString() + ",");
    }


    public void overlook(Dunno obj) {
        System.out.print(this.toString() + Circumstance.PROUDLY + Circumstance.WITHLOVE + " смотрел на " + obj.toString());
    }

    public String toString() {
        return name + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gunka gunka = (Gunka) o;
        return Objects.equals(name, gunka.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
