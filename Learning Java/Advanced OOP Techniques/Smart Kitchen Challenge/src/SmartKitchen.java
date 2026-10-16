public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private Dishwasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker(false);
        iceBox = new Refrigerator(false);
        dishWasher = new Dishwasher(false);
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public Dishwasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag,
                                boolean dishWasherFlag) {

        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }
}
