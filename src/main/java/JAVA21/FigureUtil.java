package JAVA21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class FigureUtil {
    public static Collection<Point> getPoints(Figure[] figures) {
        ArrayList<Point> allPoints = new ArrayList<>();

        for (Figure f : figures) {
            Collection<Point> points = f.getPoints();
            allPoints.addAll(points);
        }

        return allPoints;
    }


    private static Random rand = new Random();



    public static Collection<Figure> genere(int x) {
        ArrayList<Figure> figures = new ArrayList<>();

        for (int i = 0; i < x; i++) {
            figures.add(getrandomfigure.generate());


    }
        return figures;

}
}
