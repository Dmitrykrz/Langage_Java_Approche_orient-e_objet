package JAVA15;


public class Round extends Figure implements Surfacable{
    private Point centre;
    private int radius;

    public Round(Point centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }
    public double surface() {
        return radius *radius *3.14;
    }


    public String toString() {
        return "[ROND " + centre.toString() + " , " + radius + "]";
    }

    public void affiche() {
        System.out.println(this.toString());
    }
    public String getType() {
        return "ROUND";}
}