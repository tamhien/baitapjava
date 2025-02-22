package baitap2;

public class Books {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Books(String name, Author[] authors, double price) {
        super();
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Books(String name, Author[] authors, double price, int qty) {
        super();
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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
        StringBuilder authorsStr = new StringBuilder();
        for (Author author : authors) {
            authorsStr.append(author.toString()).append(", ");
        }
        // Loại bỏ dấu phẩy cuối cùng
        if (authorsStr.length() > 0) {
            authorsStr.setLength(authorsStr.length() - 2);
        }
        return "Books[name=" + name + ", authors={" + authorsStr.toString() + "}, price=" + price + ", qty=" + qty + "]";
    }

    public String getAuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (Author author : authors) {
            authorNames.append(author.getName()).append(", ");
        }
        // Loại bỏ dấu phẩy cuối cùng
        if (authorNames.length() > 0) {
            authorNames.setLength(authorNames.length() - 2);
        }
        return authorNames.toString();
    }

    public static void main(String[] args) {
        // Khai báo và cấp phát một mảng tác giả
        Author[] tacgia = new Author[2];
        tacgia[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        tacgia[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Khai báo và cấp phát một thể hiện Books
        Books javaDummy = new Books("Java for Dummy", tacgia, 19.99, 99);
        System.out.println(javaDummy); // toString()
    }
}
