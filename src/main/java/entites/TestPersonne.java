package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        Personne mike = new Personne();
        Personne george = new Personne();
        george.address = new AdressePostale();
        george.prenom="Black";
        george.nom="George";
        george.address.numeroRue=1;
        george.address.libelleRue="rue 1";
        george.address.ville="Montpellier";
        george.address.codePostal=34000;

        mike.address = new AdressePostale();
        mike.prenom="White";
        mike.nom="Michaele";
        mike.address.libelleRue="rue 2";
        mike.address.ville="Montpellier";
        mike.address.codePostal=34000;

        Personne steeve = new Personne("Gray", "Steeve");
        Personne john = new Personne("Blue", "John", new AdressePostale(12, "rue de qwerty2",34000,"Montpellier"));

        john.show();


        john.show_address();
        john.change_address(new AdressePostale(12, "Rue lalala", 34000, "Montpellier"));


        john.show_address();






    }
}
