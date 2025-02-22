package baitap5;

public class  ex5_1_1 {
    private ex5_1 base; // Sử dụng ex5_1 (đã đổi tên từ Circle)
    private double height;

    public  ex5_1_1() {
        base = new ex5_1();
        height = 1.0;
    }

    public  ex5_1_1(double height) {
        base = new ex5_1();
        this.height = height;
    }

    public ex5_1_1(double radius, double height) {
        base = new ex5_1(radius);
        this.height = height;
    }

    public  ex5_1_1(double radius, String color, double height) {
        base = new ex5_1(radius, color);
        this.height = height;
    }

    public ex5_1 getBase() {
        return base;
    }

    public void setBase(ex5_1 base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder[base=" + base + ",height=" + height + "]";
    }
}