package composition;

public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen(CoffeeMaker brewMaster, DishWasher dishWasher, Refrigerator iceBox) {
        this.brewMaster = brewMaster;
        this.dishWasher = dishWasher;
        this.iceBox = iceBox;
    }

    //another way
    public SmartKitchen() {
        brewMaster = new CoffeeMaker(false);
        iceBox = new Refrigerator(false);
        dishWasher = new DishWasher(false);
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public void addWater() {
        brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean iceBoxHasWorkToDo, boolean dishWasherHasWorkToDo, boolean brewMasterHasWorkToDo) {

        iceBox.setHasWorkToDo(iceBoxHasWorkToDo);
        iceBox.orderFood();

        dishWasher.setHasWorkToDo(dishWasherHasWorkToDo);
        dishWasher.doDishes();

        brewMaster.setHasWorkToDo(brewMasterHasWorkToDo);
        brewMaster.brewCoffee();
    }
}
