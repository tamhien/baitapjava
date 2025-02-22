package baitap6;
public class ex6_2_3 implements ex6_2_1 {
    private double width;
    private double length;

    public ex6_2_3(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length + "]";
    }
}
