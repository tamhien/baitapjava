package baitap4;

public class ex4_1 {
  private double radius;
  private String color = "red";
public ex4_1() {
	super();
}
public ex4_1(double radius) {
	super();
	this.radius = radius;
}
public ex4_1(double radius, String color) {
	super();
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
	return 3.14*radius*radius;
}
    @Override
    public String toString() {
        return "ex4_1[radius=" + radius + ", color=" + color + "]";
    }
}


