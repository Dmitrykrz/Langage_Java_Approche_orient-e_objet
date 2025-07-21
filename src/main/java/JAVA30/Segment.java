package JAVA30;

import java.util.Collection;
import java.util.List;

public class Segment extends Figure {
    private Point debut;
    private Point fin;
    public boolean couvre (Point p) {
        return false;}




    public Segment(Point debut, int longueur, boolean horizontal) {
        this(debut, longueur, horizontal,Couleur.getCouleurDefaut());
    }


    public Segment(Point debut, int longueur, boolean horizontal,Couleur c) {
        this.debut = debut;
        if (horizontal) {
            this.fin = new Point(debut.getX()  + longueur, debut.getY() );
        } else {
            this.fin = new Point(debut.getX() , debut.getY() + longueur);
        }
        this.figure_color=c;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (!getClass().isAssignableFrom(o.getClass()) && !o.getClass().isAssignableFrom(getClass())))
            return false;
        Segment s = ((Segment) o);
        return s.debut.equals(debut) && s.fin.equals(fin) && s.figure_color==this.figure_color;
    }


    public Collection<Point> getPoints() {
        return List.of (new Point[] {this.debut, this.fin});
    }

    public String toString() {
        return "SEGMENT[" + debut.toString() + " -  " + fin.toString() +   ";" +this.figure_color.getShortColorCode() +"]";
    }


    public String getType() {
        return "SEGMENT";
    }


    public void affiche() {
        System.out.println(this.toString());
    }
}