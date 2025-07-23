package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);

        int longueurChaine = chaine.length();
        System.out.println("Longueur de la chaîne: " + longueurChaine);

        int indexPremierSemiColon = chaine.indexOf(';');
        System.out.println("Index du premier ';': " + indexPremierSemiColon);

        String nomFamille = chaine.substring(0, indexPremierSemiColon);
        System.out.println("Nom de famille: " + nomFamille);


        System.out.println("Nom de famille en majuscules: " + nomFamille.toUpperCase());

        System.out.println("Nom de famille en minuscules: " + nomFamille.toLowerCase());

        String[] splitString = chaine.split(";");

        for (String part : splitString) {
            System.out.println(part);
        }
        Salarie marcel= new Salarie(splitString[0].toUpperCase(),splitString[1],Double.parseDouble(splitString[2].replace(" ", "")));

    }
}

