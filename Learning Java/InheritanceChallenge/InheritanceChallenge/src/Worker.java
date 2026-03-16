import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(String birthDate) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birth = LocalDate.parse(birthDate, formatter);
        return LocalDate.now().getYear() - birth.getYear();
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate() {
        this.endDate = LocalDate.now().toString();
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
