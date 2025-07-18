package JAVA24;

import java.util.Collection;

public abstract class Figure implements Comparable<Figure> {

    public abstract String getType();

    public abstract void affiche();

    public abstract Collection<Point> getPoints();

    public abstract boolean couvre(Point p);

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract String toString();

    public double distanceOrigine() {
        Point origin = new Point(Point.INIT_X, Point.INIT_Y);
        double minDistance = -1;

        for (Point p : getPoints()) {
            double dist = p.distance(origin);
            if (dist < minDistance || minDistance == -1) {
                minDistance = dist;
            }
        }
        return minDistance;
    }

    //public boolean compareTo(Figure f) {
    //  return (this.distanceOrigine() < f.distanceOrigine());
    // }


    public int compareTo(Figure other) {
        double thisDistance = this.distanceOrigine();
        double otherDistance = other.distanceOrigine();

        if (thisDistance < otherDistance) {
            return -1;
        } else if (thisDistance > otherDistance) {
            return 1;
        } else {
            return 0;
        }


    }
}