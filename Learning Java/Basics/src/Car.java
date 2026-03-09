public class Car {

    private String make = "Tesla";
    private String model = "Model S";
    private String color = "Gray";
    private int doors = 2;
    private boolean isConvertible = true;


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }


    public void setMake(String make) {

        if (make == null) make = "unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> make = "unsupported";
        }

        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.isConvertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-door " +
                color + " " +
                make + " " +
                model + " " +
                (isConvertible ? "Convertible" : ""));
    }
}
