//IProduct
public abstract class Table {
    private String name;

    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void attachLegs() {
        System.out.println("Attaching Legs.");
    }

    public void attachTableTop() {
        System.out.println("Attaching tabletop");
    }
}