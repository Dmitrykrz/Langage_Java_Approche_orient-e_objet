package JAVA30;

import java.util.List;

public class test_comparator {

    public static void main(String[] args) {

        Dessin d = new Dessin();
        for (int i = 0; i < 5; i++) {
            d.add(getRandomFigure.generate());
        }
        DessinToBMP.createBMP(d,"1.bmp");
        System.out.println("----------------- Dessin ------------------");
        System.out.println(d.toString());



        System.out.println("----------------- trieProcheOrigine ------------------");
        List<Figure> sortedByOrigin = FigureUtil.trieProcheOrigine(d);
        for (Figure f : sortedByOrigin) {

            System.out.println( f.toString()+" distance "+ f.distanceOrigine());
        }

        System.out.println("\n");


        System.out.println("----------------- trieDominant ------------------");
        List<Surfacable> sortedBySurface = FigureUtil.trieDominant(d);
        if (sortedBySurface.isEmpty()) {
            System.out.println("no surfacable");
        } else {
            for (Surfacable s : sortedBySurface) {
                Figure fig = (Figure) s;
                System.out.println(fig.toString()+" surface "+s.surface());
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }
}