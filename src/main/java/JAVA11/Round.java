package JAVA11;


public class Round {
    private JAVA11.Point centre;
    private int radius;

    public Round(Point centre, int radius) {
        this.centre = centre;
        this.radius = radius;
    }


    public String toString() {
        return "[ROND " + centre.toString() + " , " + radius + "]";
    }

    public void affiche() {
        System.out.println(this.toString());
    }
}