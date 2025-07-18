package JAVA26;


import java.util.Collection;
import java.util.List;

public class Round extends Figure implements Surfacable {
    private Point centre;
    int radius;

    public boolean couvre(Point p) {

        return (this.radius>=Math.sqrt(Math.pow(this.centre.getX() - p.getX(), 2) + Math.pow(this.centre.getY() - p.getY(), 2)))


                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || (!getClass().isAssignableFrom(o.getClass()) && !o.getClass().isAssignableFrom(getClass())))
            return false;
        Round r = ((Round) o);
        return r.centre.equals(this.centre) && r.radius == this.radius;
    }


    public boolean equals(Round f){

        return(this.centre.equals(f.centre)&&(this.radius==f.radius));
    }


    public Round(Point centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }
    public double surface() {
        return radius *radius *3.14;
    }

    public Collection<Point> getPoints() {
        return List.of(this.centre);
    }


    public String toString() {
        return "ROND[" + centre.toString() + "," + radius + "]";
    }

    public void affiche() {
        System.out.println(this.toString());
    }
    public String getType() {
        return "ROUND";}
}