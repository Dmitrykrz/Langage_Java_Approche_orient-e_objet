package JAVA26;

import java.util.Random;

public class getrandomfigure {
    private static Random rand = new Random();

    public static Figure generate() {
        int choice = rand.nextInt(5);

        switch (choice) {
            case 0:
                return new Point(rand.nextInt(100), rand.nextInt(100));
            case 1:
                return new Rectangle(
                        new Point(rand.nextInt(100), rand.nextInt(100)),
                        rand.nextInt(50) + 1,
                        rand.nextInt(50) + 1
                );
            case 2:
                return new Carre(
                        new Point(rand.nextInt(100), rand.nextInt(100)),
                        rand.nextInt(50) + 1
                );
            case 3:
                return new Round(
                        new Point(rand.nextInt(100), rand.nextInt(100)),
                        rand.nextInt(50) + 1
                );
            case 4:
                return new Segment(
                        new Point(rand.nextInt(100), rand.nextInt(100)),
                        rand.nextInt(100),rand.nextBoolean());

            default:
                return null;
        }
    }
}