package baitap4;

public class ex4_4 {
    private float x = 0.0f;
    private float y = 0.0f;

    public ex4_4(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public ex4_4() {
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}