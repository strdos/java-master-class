package Polymorphism;

public class GasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds average: %.2f %n", avgKmPerLitre);
    }
    public static GasPoweredCar makeGasPoweredCar(String description, double avgKmPerLitre, int cylinders) {
        return new GasPoweredCar(description, avgKmPerLitre, cylinders);
    }
}
