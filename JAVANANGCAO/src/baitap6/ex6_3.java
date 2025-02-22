package baitap6;

public class ex6_3 implements ex6_3_1 {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public ex6_3(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ") speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    public static void main(String[] args) {
        ex6_3 movablePoint = new ex6_3(0, 0, 2, 3);
        System.out.println(movablePoint);

        movablePoint.moveRight();
        System.out.println(movablePoint);

        movablePoint.moveDown();
        System.out.println(movablePoint);

        movablePoint.moveLeft();
        System.out.println(movablePoint);

        movablePoint.moveUp();
        System.out.println(movablePoint);
    }
}