package JAVA10;

public class TestRectangle {
    public static void main(String[] args) {
        Point basGauche = new Point(1, 1);
        int largeur = 50;
        int hauteur = 100;

        Rectangle rect = new Rectangle(basGauche, largeur, hauteur);
        rect.affiche();

    }
}