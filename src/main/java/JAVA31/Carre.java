package JAVA31;


public class Carre extends Rectangle implements Surfacable {

    public Carre(Point basGauche, int size) throws DessinHorsLimiteException {
        super(basGauche, size, size,Couleur.getCouleurDefaut());
    }

    public Carre(Point basGauche, int size,Couleur c) throws DessinHorsLimiteException {
        super(basGauche, size, size,c);
    }

    public String getType() {
        return "Carre";
    }


}