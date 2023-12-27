package oopChallenge2;

public class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;


    public Burger(String name, double price) {
        super("burger", name, price);

    }

    @Override
    public String getName() {
        return super.getName() + " total";
    }

    @Override
    public double getAdjustedPrice() {
        return getBasePrice() +
                ((extra1 == null) ? 0 : extra1.getAdjustedPrice()) +
                ((extra2 == null) ? 0 : extra2.getAdjustedPrice()) +
                ((extra3 == null) ? 0 : extra3.getAdjustedPrice());
    }

    public double getExtraPrice(String toppingName) {
        return switch (toppingName) {
            case "onions" -> 1.00;
            case "avocado", "cheese", "olives" -> 2.00;
            case "salami", "ham", "chicken" -> 2.50;
            default -> 3.00;
        };
    }

    public void addTopping(String topping) {
        if (extra1 == null) {
            extra1 = new Item("topping", topping, getExtraPrice(topping));
            extra1.printItem();
        } else if (extra2 == null) {
            extra2 = new Item("topping", topping, getExtraPrice(topping));
            extra2.printItem();
        }   else if (extra3 == null) {
            extra3 = new Item("topping", topping, getExtraPrice(topping));
            extra3.printItem();
        } else {
            System.out.println("toppings limit exceeded");
        }
    }

/*    public void addToppings(Item item) {
        if (extra1 == null) {
            extra1 = item;
        } else if (extra2 == null) {
            extra2 = item;
        }   else if (extra3 == null) {
            extra3 = item;
        } else {
            System.out.println("toppings limit exceeded");
            return;
        }
        item.printItem();
    }*/


}
