package JAVA24;


public class Carre extends Rectangle implements Surfacable {

    public Carre(Point basGauche, int size) {
        super(basGauche, size, size);   // delegates to Rectangle constructor
    }

    public String getType() {
        return "CARRE";
    }
}