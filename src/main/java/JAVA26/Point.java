package JAVA26;

import java.util.Collection;
import java.util.List;

public class Point extends Figure {
    private int x;
    private int y;
    public static final int INIT_X = 0;
    public static final int INIT_Y = 0;

    public Collection<Point> getPoints() {
        return List.of(new Point[]{this});
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
    }
    public Point() {
        this.x = INIT_X;
        this.y = INIT_Y;
    }
    public Point(int x, int y) {
        if (x < 0 || x > 99 || y < 0 || y > 99) throw new IllegalArgumentException("out of border");
        this.x = x;
        this.y = y;
    }




    public int getX() { return x; }
    public int getY() { return y; }



    public String toString() {
        return "[" + this.x + ";" + this.y + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().isAssignableFrom(o.getClass())) return false;
        Point p = ((Point) o);
        return p.x == x && p.y == y;
    }

    public String getType() {
        return "POINT";}

    public void affiche() {
        System.out.println(this.toString());
    }

    public boolean couvre (Point p) {
        return false;}
}
