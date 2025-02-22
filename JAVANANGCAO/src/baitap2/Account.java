package baitap2;
public class Account {
    private int id;
    private Customer25 customer;
    private double balance = 0.0;  // default value

    // Constructor với balance
    public Account(int id, Customer25 customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    // Constructor không có balance
    public Account(int id, Customer25 customer) {
        this.id = id;
        this.customer = customer;
    }

    // Getters và Setters
    public int getId() {
        return id;
    }

    public Customer25 getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    // Phương thức deposit
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    // Phương thức withdraw
    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        }
        return this;
    }

    // toString method
    @Override
    public String toString() {
        // Định dạng balance với 2 chữ số thập phân
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }
}