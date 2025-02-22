package baitap2;

public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    // Constructor 1
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    // Constructor 2
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
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

    @Override
    public String toString() {
        return "Book[name=" + name + "," + author.toString() + ",price=" + price + ",qty=" + qty + "]";
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng Author
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Kiểm tra toString() của Author

        // Khởi tạo đối tượng Book
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);  // Kiểm tra toString() của Book

        // Kiểm tra phương thức getter và setter
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("Tên sách: " + dummyBook.getName());
        System.out.println("Giá sách: " + dummyBook.getPrice());
        System.out.println("Số lượng: " + dummyBook.getQty());
        System.out.println("Tác giả: " + dummyBook.getAuthor());  // Gọi toString() của Author
        System.out.println("Tên tác giả: " + dummyBook.getAuthor().getName());
        System.out.println("Email tác giả: " + dummyBook.getAuthor().getEmail());

        // Tạo sách với tác giả ẩn danh
        Book anotherBook = new Book("More Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}
