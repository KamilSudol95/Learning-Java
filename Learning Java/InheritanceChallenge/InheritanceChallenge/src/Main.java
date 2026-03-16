public class Main {

    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge(tim.getBirthDate()));
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "16/03/2020",
                35000, false);

        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());
        joe.retire();
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "11/11/1995", "21/05/2020", 20);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}
