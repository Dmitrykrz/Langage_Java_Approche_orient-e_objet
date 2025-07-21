package JAVA30;

import java.util.Random;

public class getRandomFigure {
    private static Random rand = new Random();

    public static Figure generate() {
        int choice = rand.nextInt(4);


        switch (choice) {

            case 0:
                return new Rectangle(
                        new Point(rand.nextInt(100), rand.nextInt(100)),
                        rand.nextInt(50) + 1,
                        rand.nextInt(50) + 1,
                        Couleur.values()[rand.nextInt(Couleur.values().length)]
                );
            case 1:
                return new Carre(
                        new Point(rand.nextInt(100), rand.nextInt(100)),
                        rand.nextInt(50) + 1,
                        Couleur.values()[rand.nextInt(Couleur.values().length)]

                );
            case 2:
                return new Round(
                        new Point(rand.nextInt(100), rand.nextInt(100)),
                        rand.nextInt(50) + 1,
                        Couleur.values()[rand.nextInt(Couleur.values().length)]
                );
            case 3:
                return new Segment(
                        new Point(rand.nextInt(100), rand.nextInt(100)),
                        rand.nextInt(100),rand.nextBoolean(),
                        Couleur.values()[rand.nextInt(Couleur.values().length)]

                );

            default:
                return null;
        }
    }
}