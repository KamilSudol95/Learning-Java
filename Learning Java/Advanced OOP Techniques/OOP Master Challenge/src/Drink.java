public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink() {
        this("coke", "small");
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        adjustPriceBasedOnSize();
    }

    public void setSize(String size) {
        this.size = size;
        adjustPriceBasedOnSize();
    }

    public String getType() {
        return type;
    }
    public String getSize() {
        return size;
    }
    public double getPrice() {
        return price;
    }

    private void adjustPriceBasedOnSize() {
        switch (this.size.toLowerCase()) {
            case "small":
                this.price = 2.00;
                break;
            case "medium":
                this.price = 2.50;
                break;
            case "large":
                this.price = 3.00;
                break;
            default:
                this.price = 2.00;
        }
    }
}
