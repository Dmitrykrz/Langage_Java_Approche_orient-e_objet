package fr.diginamic.essais;


import fr.diginamic.maison.*;

public class TestMaison {

    public static void main(String[] args) {

        Maison maison = new Maison();

        System.out.println("Adding rooms to the house...");
        maison.ajouterPiece(new SalleDeBain(10, 1));
        maison.ajouterPiece(new Salon(15, 0));
        maison.ajouterPiece(new Chambre(15, 1));
        maison.ajouterPiece(new WC(2, 0));
        maison.ajouterPiece(new Cuisine(15, 0));


        System.out.println("Superficie totale de la maison: " + maison.getSuperficieTotale());
        System.out.println("Superficie totale de la RDC: " + maison.getSuperficieParEtage(0));
        Maison maison2 = new Maison();
        try {

            maison2.ajouterPiece(new SalleDeBain(-10, 1));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {

            maison2.ajouterPiece(null);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Superficie totale de Salon " + maison.surfaceByRoomType(Salon.class));
        System.out.println("Nombre de Salon " + maison.numberByRoomType(Salon.class));



    }
}