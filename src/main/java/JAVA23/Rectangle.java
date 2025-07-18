package JAVA23;


import java.util.Collection;
import java.util.List;

public class Rectangle extends Figure implements Surfacable {
    Point basGauche;
    int largeur;
    int hauteur;

    public boolean equals(Rectangle f){

        return(this.getPointBasDroit().equals(f.getPointBasDroit())) &&
                (this.getPointBasGauche().equals(f.getPointBasGauche())) &&
                (this.getPointHautGauche().equals(f.getPointHautGauche())) &&
                (this.getPointHautDroit().equals(f.getPointHautDroit()));
    }

    public boolean couvre(Point p) {

        return ((p.getX() >= this.basGauche.getX()) &&
                (p.getX() <= this.basGauche.getX() + largeur) &&
                (p.getY() >= this.basGauche.getY()) &&
                (p.getY() <= this.basGauche.getY() + hauteur))


                ;
    }

    public Rectangle(Point basGauche, int largeur, int hauteur) {
        this.basGauche = basGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public Collection<Point> getPoints() {
        return List.of(new Point[]{
                getPointBasGauche(),
                getPointBasDroit(),
                getPointHautGauche(),
                getPointHautDroit()
        });
    }

    public double surface() {
        return largeur * hauteur;
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

    public String getType() {
        return "RECT";
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (!getClass().isAssignableFrom(o.getClass()) && !o.getClass().isAssignableFrom(getClass()) && !Carre.class.isAssignableFrom(o.getClass())))
            return false;
        if (Carre.class.isAssignableFrom(o.getClass())) {
            Carre r = ((Carre) o);
            return r.getPointBasDroit().equals(this.getPointBasDroit()) && r.getPointBasGauche().equals(this.getPointBasGauche())
                    && r.getPointHautGauche().equals(this.getPointHautGauche()) && r.getPointHautDroit().equals(this.getPointHautDroit());
        } else {
            Rectangle r = ((Rectangle) o);
            return r.getPointBasDroit().equals(this.getPointBasDroit()) && r.getPointBasGauche().equals(this.getPointBasGauche())
                    && r.getPointHautGauche().equals(this.getPointHautGauche()) && r.getPointHautDroit().equals(this.getPointHautDroit());
        }
    }


}
