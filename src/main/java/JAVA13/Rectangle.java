package JAVA13;



public class Rectangle {
    Point basGauche;
    int largeur;
    int hauteur;

    public Rectangle(Point basGauche, int largeur, int hauteur) {
        this.basGauche = basGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Point getPointBasGauche() {
        return basGauche;
    }

    public Point getPointBasDroit() {
        return new Point(basGauche.getX() + largeur, basGauche.getY());
    }

    public Point getPointHautGauche() {
        return new Point(basGauche.getX(), basGauche.getY() + hauteur);
    }

    public Point getPointHautDroit() {
        return new Point(basGauche.getX() + largeur, basGauche.getY() + hauteur);
    }


    public String toString() {
        return
                getType() + "[" +
                        getPointBasGauche().toString() +
                        getPointBasDroit().toString() +
                        getPointHautGauche().toString() +
                        getPointHautDroit().toString() +
                        "]";
    }

    public void affiche() {
        System.out.println(this.toString());
    }

    protected String getType() {
        return "RECT";
    }


    public boolean equals (Rectangle a){
        return (this.basGauche.equals(a.basGauche)) && (this.largeur == a.largeur) &&(this.hauteur == a.hauteur);

    }

    public boolean equals (Carre a){
        return (this.basGauche.equals(a.basGauche)) && (this.largeur == a.largeur) &&(this.hauteur == a.hauteur);

    }

}
