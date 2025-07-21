package JAVA30;


import java.util.*;

public class FigureUtil {
    private static Map<String, Figure> figuresMap = new HashMap<>();

    public static Map<String, Figure> getFiguresMap() {
        return figuresMap;
    }


    //public static Point getRandomPoint(String key) {
    //    Point p = new Point(rand.nextInt(100), rand.nextInt(100));
    //    figuresMap.put(key, p);
    //    return p;
    //}


    public static Rectangle getRandomRectangle(String key) {
        Rectangle r = new Rectangle(
                new Point(rand.nextInt(100), rand.nextInt(100)),
                rand.nextInt(50) + 1,
                rand.nextInt(50) + 1
        );
        figuresMap.put(key, r);
        return r;
    }


    public static Carre getRandomCarre(String key) {
        Carre c = new Carre(
                new Point(rand.nextInt(100), rand.nextInt(100)),
                rand.nextInt(50) + 1
        );
        figuresMap.put(key, c);
        return c;
    }




    public static Round getRandomRound(String key) {
        Round r = new Round(
                new Point(rand.nextInt(100), rand.nextInt(100)),
                rand.nextInt(50) + 1
        );
        figuresMap.put(key, r); // Store with the provided key
        return r;
    }
    public static Segment getRandomSegment(String key) {
        Segment s = new Segment(
                new Point(rand.nextInt(100), rand.nextInt(100)),
                rand.nextInt(100), rand.nextBoolean()
        );
        figuresMap.put(key, s); // Store with the provided key
         return s;
    }




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
            figures.add(getRandomFigure.generate());


    }
        return figures;

}


    public static Collection<Figure> genere_2_with_key(int x) {
        ArrayList<Figure> figures = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            // Generate a unique key for each figure when using this method

            int choice = rand.nextInt(5);
            switch (choice) {

                case 0:
                    figures.add(getRandomRectangle(Integer.toString(i)));
                    break;
                case 1:
                    figures.add(getRandomCarre(Integer.toString(i)));
                    break;
                case 2:
                    figures.add(getRandomRound(Integer.toString(i)));
                    break;
                case 3:
                    figures.add(getRandomSegment(Integer.toString(i)));
                    break;
            }
        }
        return figures;
    }








}
