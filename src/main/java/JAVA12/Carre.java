package JAVA12;



public class Carre extends Rectangle {

    public Carre(Point basGauche, int size) {
        super(basGauche, size, size);   // delegates to Rectangle constructor
    }

    protected String getType() {
        return "CARRE";
    }
}