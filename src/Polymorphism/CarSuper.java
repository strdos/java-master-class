package Polymorphism;

public class CarSuper {

    private String description;

    public CarSuper(String description) {
        this.description = description;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine");
    }

    protected void runEngine() {
        System.out.println("Car -> runEngine");
    }

    public void drive() {
        System.out.println("Car -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    public static CarSuper makeCar(String description) {
        return new CarSuper(description);
    }
}
