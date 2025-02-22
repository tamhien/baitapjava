package baitap4;

public class ex4_4_1 extends ex4_4 {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public ex4_4_1(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public ex4_4_1(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public ex4_4_1() {
        super(); // Gọi constructor không tham số của lớp cha ex4_4
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "),speed=(" + xSpeed + "," + ySpeed + ")";
    }

    public ex4_4_1 move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
