package JAVA11;

import java.util.Random;

public class FigureUtil {
    private static final Random rand = new Random();
    public static Round getRandomRond() {

        Point centre = getRandomPoint();
        int rayon = rand.nextInt(10) + 1;
        return new Round(centre, rayon);


    }

    private static Point getRandomPoint() {
        int x = rand.nextInt(100) + 1;
        int y = rand.nextInt(100) + 1;
        return new Point(x, y);
    }

    public static Rectangle getRandomRectangle() {
        Point basGauche = getRandomPoint();
        int largeur = rand.nextInt(100) + 1;
        int hauteur = rand.nextInt(100) + 1;
        return new Rectangle(basGauche, largeur, hauteur);
    }
}
