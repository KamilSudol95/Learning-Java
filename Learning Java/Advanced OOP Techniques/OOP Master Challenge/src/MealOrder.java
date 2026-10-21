public class MealOrder {
    private Burger burger;
    private Drink drink;
    private Side side;

    public MealOrder() {
        this.burger = new Burger();
        this.drink = new Drink();
        this.side = new Side();
    }

    public MealOrder(Burger burger, Drink drink, Side side) {
        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public void addBurgerTopping(String name, double price) {
        burger.addTopping(new Topping(name, price));
    }

    public void changeDrinkSize(String size) {
        drink.setSize(size);
    }

    public void printItemizedList() {
        System.out.println("--- MEAL RECEIPT ---");
        burger.printItemized();
        System.out.println("Drink: " + drink.getType() + " (" + drink.getSize() + ") - $" + drink.getPrice());
        System.out.println("Side: " + side.getType() + " - $" + side.getPrice());
        System.out.println("--------------------");
        System.out.println("TOTAL DUE: $" + getTotalPrice());
        System.out.println("====================\n");
    }

    private double getTotalPrice() {
        return burger.getBasePrice() + burger.getToppingsPrice() + drink.getPrice() + side.getPrice();
    }
}