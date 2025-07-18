package JAVA24;

import java.util.List;
import java.util.Collection; // Import Collection for Dessin constructor

public class test_comparator {

    public static void main(String[] args) {

        Dessin d = new Dessin();
        for (int i = 0; i < 5; i++) {
            d.add(getrandomfigure.generate());
        }

        System.out.println("--- Original Figures in Dessin ---");
        System.out.println(d.toString());



        System.out.println("--- Figures Sorted by Distance to Origin (Closest to Farthest) ---");
        List<Figure> sortedByOrigin = FigureUtil.trieProcheOrigine(d);
        for (Figure f : sortedByOrigin) {

            System.out.printf("%s: %s (Distance to Origin: %.2f)%n", f.getType(), f.toString(), f.distanceOrigine());
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("\n");


        System.out.println("--- Surfacable Figures Sorted by Surface Area (Largest to Smallest) ---");
        List<Surfacable> sortedBySurface = FigureUtil.trieDominant(d);
        if (sortedBySurface.isEmpty()) {
            System.out.println("No surfacable figures found in the dessin.");
        } else {
            for (Surfacable s : sortedBySurface) {
                // Since 's' is Surfacable, we need to cast it back to Figure to get getType() and toString()
                // if we want to print those details. Alternatively, we can just print the surface.
                // Assuming all Surfacable figures are also Figures from your hierarchy.
                Figure fig = (Figure) s;
                System.out.printf("%s: (Surface Area: %.2f)%n", fig.toString(), s.surface());
            }
        }
        System.out.println("---------------------------------------------------------------------");
    }
}