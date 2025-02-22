package baitap4;

public class ex4_1_1 extends ex4_1 {
	   private double height;  
	   public ex4_1_1() { 
	      super();       
	      height = 1.0; 
	   } 
	   public ex4_1_1(double height) { 
	      super();        
	      this.height = height; 
	   }
	   public ex4_1_1(double radius, double height) { 
	      super(radius);    
	      this.height = height; 
	   }
	   public double getHeight() { 
	      return height; 
	   }
	   public double getVolume() { 
	      return getArea()*height; 
	   } 
	   public static void main (String[] args) {
		      // Declare and allocate a new instance of cylinder
		      //   with default color, radius, and height
		   ex4_1_1 c1 = new ex4_1_1();
		      System.out.println("Cylinder:"
		            + " radius=" + c1.getRadius()
		            + " height=" + c1.getHeight()
		            + " base area=" + c1.getArea()
		            + " volume=" + c1.getVolume());
		   
		      // Declare and allocate a new instance of cylinder
		      //   specifying height, with default color and radius
		      ex4_1_1 c2 = new ex4_1_1(10.0);
		      System.out.println("Cylinder:"
		            + " radius=" + c2.getRadius()
		            + " height=" + c2.getHeight()
		            + " base area=" + c2.getArea()
		            + " volume=" + c2.getVolume());
		   
		      // Declare and allocate a new instance of cylinder
		      //   specifying radius and height, with default color
		      ex4_1_1 c3 = new ex4_1_1(2.0, 10.0);
		      System.out.println("Cylinder:"
		            + " radius=" + c3.getRadius()
		            + " height=" + c3.getHeight()
		            + " base area=" + c3.getArea()
		            + " volume=" + c3.getVolume());
		   }
	}
	 

