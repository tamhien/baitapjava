package baitap4;

public class ex4_3_1 extends ex4_3 {
    private float z = 0.0f;

    public ex4_3_1(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public ex4_3_1() {
        super(); // Gọi constructor không tham số của lớp cha ex4_3
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
    public static void main(String[] args) {
        ex4_3 point2D = new ex4_3(2.5f, 3.7f);
        ex4_3_1 point3D = new ex4_3_1(1.0f, 2.0f, 3.0f);

        System.out.println("Point 2D: " + point2D); // Output: Point 2D: (2.5,3.7)
        System.out.println("Point 3D: " + point3D); // Output: Point 3D: (1.0,2.0,3.0)
    }
}