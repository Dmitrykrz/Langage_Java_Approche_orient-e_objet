package JAVA30;

public class test_random {


    public static void main(String[] args) {

        Figure w = getRandomFigure.generate();

        System.out.println("Random figure ");
        System.out.println("type " + w.getType());
        w.affiche();
        if (w instanceof Surfacable) {
            double s = ((Surfacable) w).surface();
            System.out.println("Surface: " + s);
        } else {
            System.out.println("Pas de surface");
        }


    }
}