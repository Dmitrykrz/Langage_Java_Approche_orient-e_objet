package JAVA31;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class FigureUtil {
    private static HashMap<String, Figure> figures;

    private static Point getRandomPoint() throws DessinHorsLimiteException {
        Random rand = new Random();
        return new Point(rand.nextInt(98), rand.nextInt(98));
    }

    public static String charge(String nomFichier) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {

            return reader.lines().collect(Collectors.joining("\n"));
        } catch (IOException e) {
            System.err.println("cannot load file " + nomFichier + ": " + e.getMessage());
            return "";
        }
    }
    public static Dessin parseFile (String drawing_from_file) throws DessinHorsLimiteException {

        Dessin d_reconstructed= new Dessin();

        System.out.println("-----------Parsing string to create new Dessin------------------");


        String[] lines = drawing_from_file.split("\n");
        //System.out.println(lines.length);
        for (String line : lines) {

            //line = line.trim();
            String c=line.substring(line.indexOf(" "),line.indexOf(" ")+2);
            //System.out.println(c);
            Couleur figure_color;
            figure_color=Couleur.Noir;
            if (c.contains("R")) {figure_color=Couleur.Rouge;}
            if (c.contains("V")) {figure_color=Couleur.Vert;}
            if (c.contains("J")) {figure_color=Couleur.Jaune;}
            if (c.contains("B")) {figure_color=Couleur.Bleu;}

            if (line.contains("Segment")) {



                System.out.println("segment found "+ figure_color); /// SEGMENT DOES NOT WORK !!!!!!!!!!!!!!!!!!!!!

                //Segment N [[x=46, y=27],[x=46, y=81]]
                int x1Start = line.indexOf("x=") + 2;
                int x1End = line.indexOf(",", x1Start);
                int x1 = Integer.parseInt(line.substring(x1Start, x1End).trim());

                int y1Start = line.indexOf("y=", x1End) + 2;
                int y1End = line.indexOf("]", y1Start);
                int y1 = Integer.parseInt(line.substring(y1Start, y1End).trim());

                int x2Start = line.indexOf("x=", y1End) + 2;
                int x2End = line.indexOf(",", x2Start);
                int x2 = Integer.parseInt(line.substring(x2Start, x2End).trim());

                int y2Start = line.indexOf("y=", x2End) + 2;
                int y2End = line.indexOf("]", y2Start);
                int y2 = Integer.parseInt(line.substring(y2Start, y2End).trim());
                boolean horizontal;
                int length;
                horizontal= y1 == y2;
                if (horizontal) length= x2-x1;
                else length= y2-y1;

                d_reconstructed.add(new Segment(new Point(x1,y1),length,horizontal,figure_color));



            }


            if (line.contains("Rond")) {
                System.out.println("Rond found "+ figure_color);
                int xStart = line.indexOf("x=") + 2;
                int xEnd = line.indexOf(",", xStart);
                int x = Integer.parseInt(line.substring(xStart, xEnd).trim());

                int yStart = line.indexOf("y=") + 2;
                int yEnd = line.indexOf("]", yStart);
                int y = Integer.parseInt(line.substring(yStart, yEnd).trim());

                int rStart = line.lastIndexOf(",") + 1;
                int rEnd = line.indexOf("]", rStart);
                int r = Integer.parseInt(line.substring(rStart, rEnd).trim());
                d_reconstructed.add(new Rond(new Point(x,y),r,figure_color));
            }


            if (line.contains("Carre")) {


                System.out.println("Carre found "+ figure_color);



            }
            if (line.contains("Rectangle") || line.contains("Carre")) {
                System.out.println("Rectangle found "+ figure_color);
                int x1Start = line.indexOf("x=") + 2;
                int x1End = line.indexOf(",", x1Start);
                int x1 = Integer.parseInt(line.substring(x1Start, x1End).trim());

                int y1Start = line.indexOf("y=", x1End) + 2;
                int y1End = line.indexOf("]", y1Start);
                int y1 = Integer.parseInt(line.substring(y1Start, y1End).trim());

                int x2Start = line.indexOf("x=", y1End) + 2;
                int x2End = line.indexOf(",", x2Start);
                int x2 = Integer.parseInt(line.substring(x2Start, x2End).trim());

                int y2Start = line.indexOf("y=", x2End) + 2;
                int y2End = line.indexOf("]", y2Start);
                int y2 = Integer.parseInt(line.substring(y2Start, y2End).trim());

                int x3Start = line.indexOf("x=", y2End) + 2;
                int x3End = line.indexOf(",", x3Start);
                int x3 = Integer.parseInt(line.substring(x3Start, x3End).trim());

                int y3Start = line.indexOf("y=", x3End) + 2;
                int y3End = line.indexOf("]", y3Start);
                int y3 = Integer.parseInt(line.substring(y3Start, y3End).trim());

                int x4Start = line.indexOf("x=", y3End) + 2;
                int x4End = line.indexOf(",", x4Start);
                int x4 = Integer.parseInt(line.substring(x4Start, x4End).trim());

                int y4Start = line.indexOf("y=", x4End) + 2;
                int y4End = line.indexOf("]", y4Start);

                int y4 = Integer.parseInt(line.substring(y4Start, y4End).trim());
                Point intial_point= new Point(x1,y1);
                int l=x3-x1;
                int h=y2-y1;
                if (line.contains("Rectangle")) {d_reconstructed.add(new Rectangle(intial_point,l,h,figure_color));}
                if (line.contains("Carre")) {d_reconstructed.add(new Carre(intial_point,l,figure_color));}


            }





        }
 return d_reconstructed;
    }








    public static void sauvegarde(Dessin dessin, String nomFichier) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomFichier))) {
            writer.print(dessin.toString());
        } catch (IOException e) {
            System.err.println("error, cannot save " + nomFichier + ": " + e.getMessage());

        }
    }





    private static Couleur getRandomCouleur(Random rand) throws DessinHorsLimiteException {
        Couleur[] c = Couleur.values();
        return c[rand.nextInt(c.length)];
    }

    public static Rond getRandomRond() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        return new Rond(p, rand.nextInt(100 - Math.max(p.getX(), p.getY())), getRandomCouleur(rand));
    }

    public static Rectangle getRandomRectangle() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        return new Rectangle(p, rand.nextInt(100 - p.getX()), rand.nextInt(100 - p.getY()), getRandomCouleur(rand));
    }

    public static Carre getRandomCarre() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        return new Carre(p, rand.nextInt(100 - Math.max(p.getX(), p.getY())), getRandomCouleur(rand));
    }

    //public static CarreHerite getRandomCarreHerite() throws DessinHorsLimiteException {
     //   Random rand = new Random();
    //    Point p = getRandomPoint();
   //    return new CarreHerite(p, rand.nextInt(100 - Math.max(p.getX(), p.getY())), getRandomCouleur(rand));
    //}

    public static Segment getRandomSegment() throws DessinHorsLimiteException {
        Random rand = new Random();
        Point p = getRandomPoint();
        boolean h = rand.nextBoolean();
        return new Segment(p, (h ?  rand.nextInt(100 - p.getX()) : rand.nextInt(100 - p.getY())), h, getRandomCouleur(rand));
    }

    public static Figure getRandomFigure() throws DessinHorsLimiteException {
        Random rand = new Random();
        return switch (rand.nextInt(4)) {
            case 0 -> getRandomCarre();
            //case 1 -> getRandomCarreHerite();
            case 1 -> getRandomRectangle();
            case 2 -> getRandomRond();
            default -> getRandomSegment();
        };
    }

    public static Surfacable getRandomSurfacable() throws DessinHorsLimiteException {
        Random rand = new Random();
        return switch (rand.nextInt(3)) {
            case 0 -> getRandomCarre();
            //case 1 -> getRandomCarreHerite();
            case 1 -> getRandomRectangle();
            default -> getRandomRond();
        };
    }

    public static Collection<Point> getPoints(Collection<Figure> figures) {
        HashSet<Point> points = new HashSet<>();

        for (Figure figure : figures) {
            points.addAll(figure.getPoints());
        }

        return points;
    }

    public static Collection<Figure> genere(int nbFigures) throws DessinHorsLimiteException {
        Collection<Figure> figures = new HashSet<>(nbFigures);

        for (int i = 0; i < nbFigures; i++) {
            figures.add(getRandomFigure());
        }

        return figures;
    }

    public static Figure getFigureEn(Point p, Dessin d) {
        Iterator<Figure> figures = d.getFigures().iterator();
        while (figures.hasNext()) {
            Figure figure = figures.next();
            if (figure.couvre(p)) {
                figures.remove();
                return figure;
            }
        }
        return null;
    }

    public static void afficheFigureEn(Point p, Dessin d) {
        Figure figure = getFigureEn(p, d);
        if (figure != null) {
            System.out.println("Point " + p + " est dans " + figure);
        } else {
            System.out.println("Point " + p + " n'est dans aucune figure du dessin");
        }
    }

    public static Collection<Figure> trieProcheOrigine(Dessin d) {
//        ArrayList<Figure> list = new ArrayList<>(d.getFigures());
//        Collections.sort(list);
//        return list;
        return new TreeSet<>(d.getFigures());
    }

    public static Collection<Surfacable> trieDominant(Dessin d) {
        ArrayList<Surfacable> list = new ArrayList<>();
        for (Figure figure : d.getFigures()) {
            if (Surfacable.class.isAssignableFrom(figure.getClass())) {
                list.add((Surfacable) figure);
            }
        }
        list.sort(new Comparator<>() {
            @Override
            public int compare(Surfacable o1, Surfacable o2) {
                if (o1.surface() > o2.surface()) {
                    return -1;
                } else if (o1.surface() < o2.surface()) {
                    return 1;
                }
                return 0;
            }
        });
        return list;
    }

    public static Figure createRandomFigure(String key) throws DessinHorsLimiteException {
        Figure figure = getRandomFigure();
        if (figures == null) {
            figures = new HashMap<>();
        }
        figures.put(key, figure);
        return figure;
    }

    public static Figure get(String key) {
        if (figures == null) {
            return null;
        }
        return figures.get(key);
    }
}
