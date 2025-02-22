package baitap2;

public class Book01 {
    private String isbn;
    private String name;
    private Author01 author; // Đổi từ Author thành Author01
    private double price;
    private int qty = 0;

    // Constructor không có qty
    public Book01(String isbn, String name, Author01 author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Constructor có qty
    public Book01(String isbn, String name, Author01 author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    // Getter và Setter
    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public Author01 getAuthor() {  // Đổi từ Author thành Author01
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private String getAuthorName() {
        return author.getName();
    }

    @Override
    public String toString() {
        return "Book01[isbn=" + isbn + 
               ",name=" + name + 
               ",Author[" + author.toString() + "]" + 
               ",price=" + price + 
               ",qty=" + qty + "]";
    }

    // Main để kiểm thử
    public static void main(String[] args) {
        // Test Author01 class
        Author01 a1 = new Author01("Tan Ah Teck", "ahteck@nowhere.com");
        System.out.println(a1);

        a1.setEmail("ahteck@somewhere.com");
        System.out.println(a1);
        System.out.println("name is: " + a1.getName());
        System.out.println("email is: " + a1.getEmail());

        // Test Book01 class
        Book01 b1 = new Book01("12345", "Java for dummies", a1, 8.8, 88);
        System.out.println(b1);

        b1.setPrice(9.9);
        b1.setQty(99);
        System.out.println(b1);
        System.out.println("isbn is: " + b1.getIsbn());
        System.out.println("name is: " + b1.getName());
        System.out.println("price is: " + b1.getPrice());
        System.out.println("qty is: " + b1.getQty());
        System.out.println("author is: " + b1.getAuthor());  // Author01's toString()
        System.out.println("author's name: " + b1.getAuthorName());
        System.out.println("author's name: " + b1.getAuthor().getName());
        System.out.println("author's email: " + b1.getAuthor().getEmail());
    }
}
