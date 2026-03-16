public class HourlyEmployee extends Employee{

    private double hourlyRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyRate) {
        super(name, birthDate, hireDate);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double collectPay() {
        return hourlyRate * 40;
    }

    public double getDoublePay() {
        return collectPay() * 2;
    }
}
