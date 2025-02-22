package baitap;

import java.util.Scanner;

public class BaiTap1_3 {
    private float length;
    private float width;

    // Constructor mặc định
    public BaiTap1_3() {
    }

    // Constructor có tham số
    public BaiTap1_3(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    // Tính diện tích hình chữ nhật
    public double getArea() {
        return length * width;
    }

    // Tính chu vi hình chữ nhật
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "[length=" + length + ", width=" + width + "]";
    }

    // Phương thức main để chạy chương trình
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước hình chữ nhật từ người dùng
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        float length = scanner.nextFloat();

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        float width = scanner.nextFloat();

        // Tạo đối tượng hình chữ nhật với giá trị nhập vào
        BaiTap1_3 rectangle = new BaiTap1_3(length, width);

        // In ra thông tin của hình chữ nhật
        System.out.println("Thông tin hình chữ nhật: " + rectangle);

        // Tính và in ra diện tích và chu vi
        System.out.printf("Diện tích: %.2f%n", rectangle.getArea());
        System.out.printf("Chu vi: %.2f%n", rectangle.getPerimeter());

        scanner.close();
    }
}
