package JAVA22;


import java.util.Collection;
import java.util.List;

public class Round extends Figure implements Surfacable {
    private Point centre;
    private int radius;

    public boolean couvre(Point p) {

        return (this.radius>=Math.sqrt(Math.pow(this.centre.getX() - p.getX(), 2) + Math.pow(this.centre.getY() - p.getY(), 2)))


                ;
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