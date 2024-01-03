package arrayLists;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    private Branch findBranch(String name) {
        for (Branch b : branches) {
            if (b.getName().equalsIgnoreCase(name)) {
                return b;
            }
        }
        return null;
    }

    public boolean addBranch(String name) {
        if (findBranch(name) != null) {
            System.out.println("Branch " + name + " already exists.");
            return false;
        }
        branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        if (findBranch(branchName) == null) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        return findBranch(branchName).newCustomer(customerName, initialTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        if (findBranch(branchName) == null) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        return findBranch(branchName).addCustomerTransaction(customerName, transaction);
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        if (findBranch(branchName) == null) {
            System.out.println("Branch " + branchName + " does not exist.");
            return false;
        }
        ArrayList<Customer> customers = findBranch(branchName).getCustomers();
        System.out.println("Customer details for branch " + branchName);
        for (int i = 0; i < customers.size(); i++) {
            System.out.println("Customer: " + customers.get(i).getName() + "[" + (i + 1) + "]");
            if (printTransactions) {
                System.out.println("Transactions");
                ArrayList<Double> transactions = customers.get(i).getTransactions();
                for (int j = 0; j < transactions.size(); j++) {
                    System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                }
            }
        }
        return true;
    }
}
