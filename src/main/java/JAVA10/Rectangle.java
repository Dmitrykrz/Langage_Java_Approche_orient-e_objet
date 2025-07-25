package JAVA10;

public class Rectangle {
    private JAVA10.Point basGauche;
    private int largeur;
    private int hauteur;

    public Rectangle(JAVA10.Point basGauche, int largeur, int hauteur) {
        this.basGauche = basGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public JAVA10.Point getPointBasGauche() {
        return basGauche;
    }

    public JAVA10.Point getPointBasDroit() {
        return new JAVA10.Point(basGauche.getX() + largeur, basGauche.getY());
    }

    public JAVA10.Point getPointHautGauche() {
        return new JAVA10.Point(basGauche.getX(), basGauche.getY() + hauteur);
    }

    public JAVA10.Point getPointHautDroit() {
        return new Point(basGauche.getX() + largeur, basGauche.getY() + hauteur);
    }


    public String toString() {
        return "[RECT " +
                getPointBasGauche().toString() +
                getPointBasDroit().toString() +
                getPointHautGauche().toString() +
                getPointHautDroit().toString() +
                "]";
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}