import java.util.Objects;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight <  15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {

        if(Objects.equals(type, "Wolf")) {
            System.out.println("Ow Woooo!");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {
        super.move(speed);
       // System.out.println("Dogs walk, run and wag their tail");

        if (Objects.equals(speed, "slow")) {
            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    public void bark() {
        System.out.println("Woof!");
    }

    public void run() {
        System.out.println("Run!");
    }

    public void walk() {
        System.out.println("Walk!");
    }

    public void wagTail() {
        System.out.println("Wag tail!");
    }
}
