package oopChallenge2;

public class Item {
    private String type;
    private String name;
    private String size;
    private double price;

    public Item(String type, String name, double price) {
        this.type = type;
        this.name = name;
        this.price = price;
        this.size = "MEDIUM";
    }

    public String getName() {
        if (type.equals("drink")) {
            return size.toLowerCase() + " " + name.toLowerCase();
        } else {
            return name.toLowerCase();
        }
    }

    public double getBasePrice() {
        return price;
    }

    public double getAdjustedPrice() {
        return switch(size.toUpperCase()) {
          case "SMALL" -> price * 0.80;
          case "LARGE" -> price * 1.35;
          default -> price;
        };
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }
}
