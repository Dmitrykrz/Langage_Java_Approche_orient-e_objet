package JAVA22;

import java.util.Collection;
import java.util.List;

public class Point extends Figure {
    private int x;
    private int y;
    public static final int INIT_X = 25;
    public static final int INIT_Y = 25;

    public Collection<Point> getPoints() {
        return List.of(new Point[]{this});
    }

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
    public boolean equals (Point a){
        return (this.x == a.getX()) && (this.y == a.getY());


    }
    public String getType() {
        return "POINT";}

    public void affiche() {
        System.out.println(this.toString());
    }

    public boolean couvre (Point p) {
        return false;}
}
