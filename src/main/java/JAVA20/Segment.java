package JAVA20;

public class Segment extends Figure {
    private Point debut;
    private Point fin;

    public Segment(Point debut, int longueur, boolean horizontal) {
        this.debut = debut;
        if (horizontal) {
            this.fin = new Point(debut.getX()  + longueur, debut.getY() );
        } else {
            this.fin = new Point(debut.getX() , debut.getY() + longueur);
        }
    }

    public Point[] getPoints() {
        return new Point[] {this.debut, this.fin};
    }

    public String toString() {
        return "[" + debut.toString() + " -  " + fin.toString() + "]";
    }


    public String getType() {
        return "SEGMENT";
    }


    public void affiche() {
        System.out.println(this.toString());
    }
}