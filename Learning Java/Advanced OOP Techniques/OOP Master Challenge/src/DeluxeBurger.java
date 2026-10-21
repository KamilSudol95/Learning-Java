public class DeluxeBurger extends Burger {

    public DeluxeBurger(String type, double price) {
        super(type, price);
        this.maxToppings = 5;
    }

    @Override
    public void addTopping(Topping topping) {
        if (toppings.size() < maxToppings) {
            // Toppings for Deluxe Burger are free of charge
            toppings.add(new Topping(topping.getName(), 0.0));
        } else {
            System.out.println("-> Max toppings (" + maxToppings + ") reached for Deluxe Burger!");
        }
    }
}