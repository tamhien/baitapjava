package baitap3;

class Ball {
    private float x;
    private float y;
    private float z;

    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() { return x; }
    public float getY() { return y; }
    public float getZ() { return z; }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

class Player {
    private int number;
    private float x;
    private float y;
    private float z;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
        this.z = 0.0f; // Initialize z explicitly
    }

    public void move(float xDisp, float yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public void jump(float zDisp) {
        this.z += zDisp;
    }

    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2));
        return distance < 8.0;
    }

    public void kick(Ball ball) {
        if (near(ball)) {
            float newX = ball.getX() + 2;
            float newY = ball.getY() + 2;
            float newZ = ball.getZ() + 1;
            ball.setXYZ(newX, newY, newZ);
        } else {
            System.out.println("Player is too far to kick the ball!");
        }
    }
}

public class ex3_7 {
    public static void main(String[] args) {
        Ball ball = new Ball(0, 0, 0);
        Player player = new Player(10, 5, 5);

        System.out.println("Ball position: " + ball);
        System.out.println("Player near ball: " + player.near(ball));
        player.kick(ball);
        System.out.println("Ball position after kick: " + ball);
    }
}
