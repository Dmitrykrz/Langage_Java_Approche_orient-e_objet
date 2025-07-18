package JAVA23;

import java.util.Collection;

public abstract class Figure {

    public abstract String getType();
    public abstract void affiche();
    public abstract Collection<Point> getPoints();
    public abstract boolean couvre (Point p);

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract String toString();
}