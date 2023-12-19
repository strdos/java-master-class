package Inheritance;

public class Main {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Adam", "2000", "2025", "2020", 50000.00, false);
        salariedEmployee.getAge();
        salariedEmployee.collectPay();
        salariedEmployee.retire();
        System.out.println(salariedEmployee);

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Brad", "2000", "2025", "2020", 50000.00, false);
        System.out.println(salariedEmployee1);
        salariedEmployee1.collectPay();

        Worker worker = new Worker("Cecilia", "2020", "2025");
        System.out.println(worker);
        worker.collectPay();
    }
}
