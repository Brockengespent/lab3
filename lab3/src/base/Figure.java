package base;

public class Figure {
    private String name;
    private String description;


    public Figure(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public void stay(Shadow obj) {
        System.out.print(obj.toString() + " стояла " + this.toString() + ",");
    }


    public void observe(Face odj) {
        System.out.println(" глядела на него " + odj.toString() + ".");
    }


    public String toString() {
        return description + " " + name;
    }
}
