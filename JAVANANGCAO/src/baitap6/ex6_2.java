package baitap6;

public class ex6_2 {
    public static void main(String[] args) {
    	 ex6_2_1 circle = new ex6_2_2(5.0);
    	 ex6_2_1 rectangle = new ex6_2_3(4.0, 6.0);

        System.out.println(circle.toString() + ", Area = " + circle.getArea() + ", Perimeter = " + circle.getPerimeter());
        System.out.println(rectangle.toString() + ", Area = " + rectangle.getArea() + ", Perimeter = " + rectangle.getPerimeter());
    }
}
