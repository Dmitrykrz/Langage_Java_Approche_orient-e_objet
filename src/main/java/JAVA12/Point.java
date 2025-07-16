package JAVA12;


public class Point {
    private int x;
    private int y;
    public static final int INIT_X = 25;
    public static final int INIT_Y = 25;

    public Point() {
        this.x = INIT_X;
        this.y = INIT_Y;
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }


    public String toString() {
        return "[" + this.x + ";" + this.y + "]";
    }
}
