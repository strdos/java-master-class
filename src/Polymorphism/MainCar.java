package Polymorphism;

public class MainCar {

    public static void main(String[] args) {

        //Car car = new Car("VW Golf");
        CarSuper car = CarSuper.makeCar("VW Golf");
        runRace(car);

        //GasPoweredCar gpCar = new GasPoweredCar("Audi Gas", 10, 4);
        //Car gpCar = new GasPoweredCar("Audi Gas", 10, 4);
        CarSuper gpCar = GasPoweredCar.makeGasPoweredCar("Audi", 10, 4);
        runRace(gpCar);

        CarSuper bevCar = new ElectricCar("Tesla", 568, 75);
        runRace(bevCar);

        CarSuper hybridCar = new HybridCar("Prius", 18, 4, 8);
        runRace(hybridCar);
    }

    public static void runRace(CarSuper car) {
        car.startEngine();
        car.drive();
    }
}
