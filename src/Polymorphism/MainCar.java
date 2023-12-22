package Polymorphism;

public class MainCar {

    public static void main(String[] args) {

        //Car car = new Car("VW Golf");
        Car car = Car.makeCar("VW Golf");
        runRace(car);

        //GasPoweredCar gpCar = new GasPoweredCar("Audi Gas", 10, 4);
        //Car gpCar = new GasPoweredCar("Audi Gas", 10, 4);
        Car gpCar = GasPoweredCar.makeGasPoweredCar("Audi", 10, 4);
        runRace(gpCar);

        Car bevCar = new ElectricCar("Tesla", 568, 75);
        runRace(bevCar);

        Car hybridCar = new HybridCar("Prius", 18, 4, 8);
        runRace(hybridCar);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
