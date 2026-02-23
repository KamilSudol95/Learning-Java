
public class mainChallenge {

    public static void main(String[] args) {


        Customer customer = new Customer("Kamil", 10000, "kamil.sudol@gmail.com");
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());


        Customer customer2 = new Customer();
        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());

        Customer customer3 = new Customer("Michael", "michael.angelo@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getCreditLimit());
        System.out.println(customer3.getEmail());

    }
}