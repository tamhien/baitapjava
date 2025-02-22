package baitap7;

	import java.util.ArrayList;
	import java.util.List;

	// Lớp Point đại diện cho một điểm với tọa độ (x, y)
	class Point {
	    private int x;
	    private int y;

	    public Point(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    @Override
	    public String toString() {
	        return "(" + x + "," + y + ")";
	    }
	}

	// Lớp PolyLine đại diện cho một đường gấp khúc
	class PolyLine {
	    private List<Point> points; // Danh sách các điểm

	    // Constructor mặc định
	    public PolyLine() {
	        points = new ArrayList<>();
	    }

	    // Constructor với danh sách điểm ban đầu
	    public PolyLine(List<Point> points) {
	        this.points = new ArrayList<>(points);
	    }

	    // Thêm một điểm mới bằng tọa độ (x, y)
	    public void appendPoint(int x, int y) {
	        points.add(new Point(x, y));
	    }

	    // Thêm một đối tượng Point vào danh sách
	    public void appendPoint(Point point) {
	        points.add(point);
	    }

	    // Tính độ dài của PolyLine
	    public double getLength() {
	        double length = 0.0;
	        for (int i = 1; i < points.size(); i++) {
	            Point p1 = points.get(i - 1);
	            Point p2 = points.get(i);
	            length += Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
	        }
	        return length;
	    }

	    // Biểu diễn dưới dạng chuỗi { (x1,y1)(x2,y2)... }
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder("{");
	        for (Point p : points) {
	            sb.append(p.toString());
	        }
	        sb.append("}");
	        return sb.toString();
	    }
	}

	// Lớp chính để chạy chương trình
	public class ex7_2 {
	    public static void main(String[] args) {
	        PolyLine polyline = new PolyLine();
	        polyline.appendPoint(1, 2);
	        polyline.appendPoint(4, 6);
	        polyline.appendPoint(new Point(7, 8));

	        System.out.println("Polyline: " + polyline);
	        System.out.println("Length: " + polyline.getLength());
	    }
	}


