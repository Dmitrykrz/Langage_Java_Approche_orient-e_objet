package JAVA10;

public class Point {
    private int x;
    private int y;

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
