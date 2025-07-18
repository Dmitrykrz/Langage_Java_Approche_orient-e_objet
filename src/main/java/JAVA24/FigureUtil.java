package JAVA24;


import java.util.*;

public class FigureUtil {



    public static List<Figure> trieProcheOrigine(Dessin d) {

        List<Figure> sortedFigures = new ArrayList<>(d.getFigures());


        Collections.sort(sortedFigures);

        return sortedFigures;
    }

    public static List<Surfacable> trieDominant(Dessin d) {
        List<Surfacable> dominantFigures = new ArrayList<>();

        for (Figure f : d.getFigures()) {
            if (f instanceof Surfacable) {
                dominantFigures.add((Surfacable) f);
            }
        }

        Collections.sort(dominantFigures, new Comparator<Surfacable>() {
            @Override
            public int compare(Surfacable s1, Surfacable s2) {
                double surface1 = s1.surface();
                double surface2 = s2.surface();

                if (surface2 < surface1) {
                    return -1;
                } else if (surface2 > surface1) {
                    return 1;
                } else {
                    return 0;  // Surfaces are equal
                }
            }
        });

        return dominantFigures;
    }

    public static Collection<Point> getPoints(Figure[] figures) {
        ArrayList<Point> allPoints = new ArrayList<>();

        for (Figure f : figures) {
            Collection<Point> points = f.getPoints();
            allPoints.addAll(points);
        }

        return allPoints;
    }
    public static Figure getFigureEn(Point p, Dessin d) {

        for (Figure f : d.getFigures()) {
            if (f.couvre(p)) {
                return f;
            }
        }
        return null;
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
