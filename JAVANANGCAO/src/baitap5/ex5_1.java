package baitap5;

public class ex5_1 {
    private double radius;
    private String color;

    public ex5_1() {
        radius = 1.0;
        color = "red";
    }

    public ex5_1(double radius) {
        this.radius = radius;
        color = "red";
    }

    public ex5_1(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }
}