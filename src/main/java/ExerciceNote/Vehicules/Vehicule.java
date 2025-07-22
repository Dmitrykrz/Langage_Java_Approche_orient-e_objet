package ExerciceNote.Vehicules;

public abstract class Vehicule {
    protected String marque;
    protected String modele;
    protected String numImmat;

    public Vehicule(String marque, String modele, String numImmat) {
        this.marque = marque;
        this.modele = modele;
        this.numImmat = numImmat;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public String getNumImmat() {
        return numImmat;
    }

    @Override
    public String toString() {
        return "N° : " + numImmat + ", Modéle : " + marque + " " + modele;
    }

}
