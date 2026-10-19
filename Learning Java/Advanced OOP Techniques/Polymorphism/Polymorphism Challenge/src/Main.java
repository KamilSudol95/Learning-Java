public class Main {

    static void main() {

        Car gasCar = new GasPoweredCar("Gas Powered Car", 10.0, 4);
        Car electricCar = new ElectricCar("Electric Car", 15.0, 50);
        Car hybridCar = new HybridCar("Hybrid Car", 12.0, 20, 30);

        testCar(gasCar);
        testCar(electricCar);
        testCar(hybridCar);

    }

    public static void testCar(Car car) {
        car.startEngine();
        car.drive();
    }
}