package JAVA11;



public class Rectangle {
    private JAVA11.Point basGauche;
    private int largeur;
    private int hauteur;

    public Rectangle(JAVA11.Point basGauche, int largeur, int hauteur) {
        this.basGauche = basGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public JAVA11.Point getPointBasGauche() {
        return basGauche;
    }

    public JAVA11.Point getPointBasDroit() {
        return new JAVA11.Point(basGauche.getX() + largeur, basGauche.getY());
    }

    public JAVA11.Point getPointHautGauche() {
        return new JAVA11.Point(basGauche.getX(), basGauche.getY() + hauteur);
    }

    public JAVA11.Point getPointHautDroit() {
        return new JAVA11.Point(basGauche.getX() + largeur, basGauche.getY() + hauteur);
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