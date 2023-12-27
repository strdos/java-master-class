package inheritance;

public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static long idCounter = 0;

    public Employee(String name, String birthDate, String endDate, String hireDate) {
        super(name, birthDate, endDate);
        this.employeeId = idCounter++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
