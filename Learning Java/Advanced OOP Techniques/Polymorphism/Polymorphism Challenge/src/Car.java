public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {

        System.out.println("Engine started");
    }

    public void drive() {

        runEngine();
        System.out.println("Driving -> " + this.getClass().getName());
    }

    protected void runEngine() {

        System.out.println("Engine running");
    }
}
