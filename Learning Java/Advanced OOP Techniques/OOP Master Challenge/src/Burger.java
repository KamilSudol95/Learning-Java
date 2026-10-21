import java.util.ArrayList;
import java.util.List;

public class Burger {
    private String type;
    private double price;
    protected List<Topping> toppings;
    protected int maxToppings = 3;

    public Burger() {
        this("hamburger", 5.00);
    }

    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        if (toppings.size() < maxToppings) {
            toppings.add(topping);
        } else {
            System.out.println("-> Max toppings (" + maxToppings + ") reached for " + type + "!");
        }
    }

    public double getBasePrice() {
        return price;
    }

    public double getToppingsPrice() {
        double total = 0;
        for (Topping t : toppings) {
            total += t.getPrice();
        }
        return total;
    }

    public void printItemized() {
        System.out.println("Burger: " + type + " - $" + getBasePrice());
        for (Topping t : toppings) {
            System.out.println("  + Topping: " + t.getName() + " - $" + t.getPrice());
        }
    }
}
