package JAVA22;

import java.util.Collection;

public abstract class Figure {
    public abstract String toString();
    public abstract String getType();
    public abstract void affiche();
    public abstract Collection<Point> getPoints();
    public abstract boolean couvre (Point p);
}