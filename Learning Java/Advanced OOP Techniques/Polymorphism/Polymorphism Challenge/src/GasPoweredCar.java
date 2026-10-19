public class GasPoweredCar extends Car {

    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
        super(description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void runEngine() {
        System.out.println("Gas Powered Car Engine is running");
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Gas Powered Car is starting engine");
    }

}
