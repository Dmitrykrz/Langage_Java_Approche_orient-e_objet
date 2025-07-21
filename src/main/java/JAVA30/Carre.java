package JAVA30;


public class Carre extends Rectangle implements Surfacable {

    public Carre(Point basGauche, int size) {
        super(basGauche, size, size,Couleur.getCouleurDefaut());
    }

    public Carre(Point basGauche, int size,Couleur c) {
        super(basGauche, size, size,c);
    }

    public String getType() {
        return "CARRE";
    }


}