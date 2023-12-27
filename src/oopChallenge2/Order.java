package oopChallenge2;

public class Order {
    private Burger burger;
    private Item side;
    private Item drink;

    public Order(String burgerType, String sideType, String drinkType) {
        this.burger = new Burger(burgerType, 4.00);
        this.side = new Item("side", sideType, 3.00);
        this.drink = new Item("drink", drinkType, 2.00);
    }

    public Order() {
        this("regular", "fries", "coke");
    }

    public double getTotalPrice() {
        return side.getAdjustedPrice() + drink.getAdjustedPrice() + burger.getAdjustedPrice();
    }

    public void printItemizedList() {
        burger.printItem();
        side.printItem();
        drink.printItem();
        System.out.println("-".repeat(30));
        Item.printItem("TOTAL: ", getTotalPrice());
        System.out.println();
    }

    public void addTopping(String topping) {
        burger.addTopping(topping);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

}
