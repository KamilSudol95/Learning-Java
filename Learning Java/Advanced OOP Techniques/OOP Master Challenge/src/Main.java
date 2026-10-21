public class Main {
    public static void main(String[] args) {

        // 1. Default Meal (Constructor without parameters)
        System.out.println("SCENARIO 1: Default Meal");
        MealOrder defaultMeal = new MealOrder();
        defaultMeal.addBurgerTopping("Cheese", 0.50);
        defaultMeal.changeDrinkSize("large");
        defaultMeal.printItemizedList();

        // 2. Custom Meal (custom burger, side and drink)
        System.out.println("SCENARIO 2: Custom Meal");
        Burger customBurger = new Burger("Cheeseburger", 6.50);
        Drink customDrink = new Drink("Sprite", "medium");
        Side customSide = new Side("Onion Rings", 3.00);

        MealOrder customMeal = new MealOrder(customBurger, customDrink, customSide);
        customMeal.addBurgerTopping("Bacon", 1.00);
        customMeal.addBurgerTopping("Lettuce", 0.20);
        customMeal.addBurgerTopping("Tomato", 0.30);
        customMeal.addBurgerTopping("Extra Pickles", 0.10); // ERROR LIMIT IS SET TO 3
        customMeal.printItemizedList();

        // 3. Deluxe Meal (Burger contains 5 toppings free of charge)
        System.out.println("SCENARIO 3: Deluxe Meal");
        Burger deluxeBurger = new DeluxeBurger("Deluxe Monster", 15.00);
        Drink deluxeDrink = new Drink("Fanta", "large");
        deluxeDrink = new Drink(deluxeDrink.getType(), deluxeDrink.getSize()) {
            @Override public double getPrice() { return 0.0; } // Drink price inlcuded in burger price
        };
        Side deluxeSide = new Side("Chili Cheese Fries", 0.0); //Side price inlcuded in burger price

        MealOrder deluxeMeal = new MealOrder(deluxeBurger, deluxeDrink, deluxeSide);
        deluxeMeal.addBurgerTopping("Cheese", 0.50);
        deluxeMeal.addBurgerTopping("Bacon", 1.00);
        deluxeMeal.addBurgerTopping("Avocado", 1.50);
        deluxeMeal.addBurgerTopping("Jalapeno", 0.50);
        deluxeMeal.addBurgerTopping("Mayo", 0.20);
        deluxeMeal.addBurgerTopping("BBQ Sauce", 0.30); // ERROR LIMIT IS SET TO 5

        deluxeMeal.printItemizedList();
    }
}