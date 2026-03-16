public class SalariedEmployee extends Employee{

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public double collectPay() {

        double payCheck = annualSalary / 26;

        return (isRetired) ? (int) (payCheck * 0.9) : (int) payCheck;
    }

    public void retire() {

        terminate();
        isRetired = true;
    }
}
