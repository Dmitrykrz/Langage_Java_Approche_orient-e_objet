package JAVA14;

public class test_random {


    public static void main(String[] args) {

        Figure w = getrandomfigure.generate();

        System.out.println("Random figure ");
        System.out.println("type " + w.getType());
        w.affiche();

    }
}