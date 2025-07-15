package entites;

import entites2.Personne;

public class TestPersonne {
    static void main(String[] args) {

        Personne mike = new Personne();
        Personne george = new Personne();

        george.prenom="Black";
        george.nom="George";
        george.address.numeroRue=1;
        george.address.libelleRue="rue 1";
        george.address.ville="Montpellier";
        george.address.codePostal=34000;


        mike.prenom="White";
        mike.nom="Michaele";
        mike.address.libelleRue="rue 2";
        mike.address.ville="Montpellier";
        mike.address.codePostal=34000;


    }
}
