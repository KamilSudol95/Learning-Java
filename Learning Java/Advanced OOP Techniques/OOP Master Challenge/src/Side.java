public class Side {
    private String type;
    private double price;

    public Side() {
        this("fries", 2.50);
    }

    public Side(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() { return type; }
    public double getPrice() { return price; }
}
