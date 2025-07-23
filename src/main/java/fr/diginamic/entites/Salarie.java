package fr.diginamic.entites;

public class Salarie {
    String nom;
    String prenom;
    double salaire;

    public Salarie(String nom, String prenom, double salaire) {
        if (nom.isEmpty() || prenom.isEmpty() || salaire < 0)
            throw new IllegalArgumentException("wrong argument when creating Salarie");
        else {
            this.nom = nom;
            this.prenom = prenom;
            this.salaire = salaire;
        }

    }


}



