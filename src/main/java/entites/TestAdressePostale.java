package entites;

public class TestAdressePostale {
     static void main(String[] args) {


        AdressePostale address1 = new AdressePostale();
        AdressePostale address2 = new AdressePostale();

        address1.codePostal=34000;
        address1.ville="Montpellier";
        address1.libelleRue="rue blabla1";
        address1.numeroRue=12;

        address2.codePostal=34000;
        address2.ville="Montpellier";
        address2.libelleRue="rue blabla2";
        address2.numeroRue=14;



        //avec constructeur
        AdressePostale address3 = new AdressePostale(12, "Rue de qwety", 34000, "Montpellier");




    }
}
