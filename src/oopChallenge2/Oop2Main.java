package oopChallenge2;

public class Oop2Main {
    public static void main(String[] args) {

/*        Item coke = new Item("drink", "coke", 2.00);
        coke.printItem();
        coke.setSize("large");
        coke.printItem();

        Item avocado = new Item("topping", "avocado", 1.95);
        avocado.printItem();

        Burger hamburger = new Burger("hamburger", 3.00);
        hamburger.printItem();
        hamburger.addTopping("avocado");
        hamburger.addTopping("olives");
        hamburger.addTopping("onions");
        hamburger.addTopping("cheese");
        hamburger.printItem();*/

        Order order = new Order();
        order.printItemizedList();

        Order order1 = new Order("cheeseburger", "salad", "pepsi");
        order1.addTopping("cheese");
        order1.addTopping("mushrooms");
        order1.setDrinkSize("Large");
        order1.printItemizedList();
    }
}
