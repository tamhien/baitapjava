package baitap;

public class TestCircle {

		private double radius;

		public TestCircle() {
		}

		public TestCircle(double radius) {
			this.radius = radius;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		public double getArea() {
			return radius * radius * Math.PI;
		}
		public double getCircumference() {
			return Math.PI;
		}

		@Override
		public String toString() {
			return "[radius=" + radius + "]";
		}
		
	}

