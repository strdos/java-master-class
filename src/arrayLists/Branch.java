package arrayLists;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String name) {
        for (Customer c: customers) {
            if (c.getName().equalsIgnoreCase(name)) {
                return c;
            }
        }
        return null;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        if (findCustomer(name) != null) {
            System.out.println("Customer " + name + " already exists.");
            return false;
        }
        customers.add(new Customer(name, initialTransaction));
        return true;
    }

    public boolean addCustomerTransaction(String name, double transaction) {
        if (findCustomer(name) == null) {
            System.out.println("Customer " + name + " does not exist.");
            return false;
        }
        findCustomer(name).addTransaction(transaction);
        return true;
    }
}
