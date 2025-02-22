package baitap;

public class Circle {
  // Thuộc tính của Circle
  private double radius;
  private String color;

  // Constructor không tham số
  public Circle() {
      radius = 1.0;
      color = "red";
  }

  // Constructor có tham số
  public Circle(double r) {
      radius = r;
      color = "red";
  }

  // Getter lấy bán kính
  public double getRadius() {
      return radius;
  }

  // Getter tính diện tích
  public double getArea() {
      return radius * radius * Math.PI;
  }

  // Hàm main để kiểm tra class
  public static void main(String[] args) {
      Circle c1 = new Circle();
      Circle c2 = new Circle(5.0);

      System.out.println("Circle 1: Radius = " + c1.getRadius() + ", Area = " + c1.getArea());
      System.out.println("Circle 2: Radius = " + c2.getRadius() + ", Area = " + c2.getArea());
  }
}
