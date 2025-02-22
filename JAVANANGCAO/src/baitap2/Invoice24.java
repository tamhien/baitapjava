package baitap2;

public class Invoice24 {
    private int id;
    private Customer24 customer;
    private double amount;

    public Invoice24(int id, Customer24 customer, double amount) {
        super();
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer24 getCustomer() {
        return customer;
    }

    public void setCustomer(Customer24 customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Thêm các phương thức mới
    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        // Tính số tiền sau khi giảm giá
        return amount * (1 - getCustomerDiscount() / 100.0);
    }

    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";
    }
    public static void main(String[] args) {
        // Test Customer class
        Customer24 c1 = new Customer24(88, "Tan Ah Teck", 10);
        System.out.println(c1);  // Customer's toString()

        c1.setDiscount(8);
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("discount is: " + c1.getDiscount());

        // Test Invoice class
        Invoice24 inv1 = new Invoice24(101, c1, 888.8);
        System.out.println(inv1);

        inv1.setAmount(999.9);
        System.out.println(inv1);
        System.out.println("id is: " + inv1.getId());
        System.out.println("customer is: " + inv1.getCustomer());  // Customer's toString()
        System.out.println("amount is: " + inv1.getAmount());
        System.out.println("customer's id is: " + inv1.getCustomerId());
        System.out.println("customer's name is: " + inv1.getCustomerName());
        System.out.println("customer's discount is: " + inv1.getCustomerDiscount());
        System.out.printf("amount after discount is: %.2f%n", inv1.getAmountAfterDiscount());
     }
  }

