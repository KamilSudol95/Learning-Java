public class Product {

    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }
}

class Monitor extends Product {

    private String resolution;
    private int size;

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Monitor(String model, String manufacturer, int size, String resolution) {
        super(model, manufacturer);
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixel(int x, int y, String color) {
        IO.println("Drawing pixel at (" + x + ", " + y + ") with color " + color);
    }
}

class Motherboard extends Product {

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios) {
        super(model, manufacturer);
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        IO.println("Program " + programName + " is now loading...");
    }
}

class ComputerCase extends Product {

    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }

    public void pressPowerButton() {
        IO.println("Power button pressed. Turning on the computer...");
    }
}