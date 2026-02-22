public class Main {

    static void main(String[] args) {

        Car car = new Car();

        car.setMake("Porsche");
        car.setModel("911");
        car.setColor("Green");
        car.setDoors(2);
        car.setConvertible(false);

        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());

        car.describeCar();

    }
}