package Inheritance;

public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;
    public SalariedEmployee(String name, String birthDate, String endDate, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        System.out.println("Salaried Employee retiring...");
    }

    @Override
    public String toString() {
        return super.toString() + " " + "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}';
    }

    @Override       //annotation not necessary
    public void collectPay() {
        System.out.println("collecting pay for a salaried employee ...");
    }
}
