package Composition;

public class SmartKitchenMain {
    public static void main(String[] args) {

        Refrigerator refrigerator = new Refrigerator();
        DishWasher dishWasher = new DishWasher(false);
        CoffeeMaker coffeeMaker = new CoffeeMaker(false);

        SmartKitchen smartKitchen = new SmartKitchen(coffeeMaker, dishWasher, refrigerator);

        smartKitchen.getBrewMaster().setHasWorkToDo(true);

        smartKitchen.getBrewMaster().brewCoffee();
        smartKitchen.getDishWasher().doDishes();
        smartKitchen.getIceBox().orderFood();

        System.out.println("-".repeat(50));

        smartKitchen.setKitchenState(true, true, true);
    }
}
