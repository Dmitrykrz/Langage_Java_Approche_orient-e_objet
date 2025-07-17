package JAVA20;

import java.util.ArrayList;

public class FigureUtil {
    public static Point[] getPoints(Figure[] figures) {
        ArrayList<Point> allPoints = new ArrayList<Point>();

        for (Figure f : figures) {
            Point[] points = f.getPoints();
            for (Point p : points) {
                allPoints.add(p);
            }
        }

        return allPoints.toArray(new Point[0]);
    }
}
